package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainFormController {
    public AnchorPane root;
    public Button btnDeposit;
    public Button btnWithdraw;
    public Label lblBalance;
    public Button btnPrintPassbook;
    public Spinner<Integer> txtAmount;

    double accountBalance;
    ArrayList<Transaction> transactionList = new ArrayList();

    public MainFormController(){
        System.out.println("Constructor");
    }

    public void initialize() {
        btnDeposit.setDisable(true);
        btnWithdraw.setDisable(true);
        txtAmount.setEditable(true);
        txtAmount.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100000,0,100));
        txtAmount.valueProperty().addListener(e -> {
            btnDeposit.setDisable(txtAmount.getValue() <= 0);
            btnWithdraw.setDisable(btnDeposit.isDisable());
        });
    }




    public void btnDepositOnAction(ActionEvent actionEvent) {
        Transaction creditTransaction = new Transaction(true,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),
                accountBalance,
                txtAmount.getValue(),
                accountBalance + txtAmount.getValue());
        accountBalance += txtAmount.getValue();
        lblBalance.setText(String.format("Balance: Rs. %, .2f",accountBalance));
        System.out.println(txtAmount.getValue() + "deposited successfully!");
        txtAmount.getValueFactory().setValue(0);
        transactionList.add(creditTransaction);
    }

    public void btnPrintPassbookOnAction(ActionEvent actionEvent) {
        final String Line = "+".concat("-".repeat(15).concat("+"))
                .concat("-".repeat(15).concat("+"))
                .concat("-".repeat(15).concat("+"))
                .concat("-".repeat(15).concat("+\n"));
        System.out.printf(Line);
        System.out.printf("|%-20s|%-15s|%15s|%15s|\n","DATE TIME","TRANSACTION","AMOUNT","BALANCE");
        System.out.printf(Line);
        if (!transactionList.isEmpty()){
            System.out.printf("|%-20s|%-15s|%,15.2f|%,15.2f|\n",
                    "",
                    );
        }
        for (Transaction transaction : transactionList) {
            System.out.printf("|%-20s|%-15s|%,15.2f|%,15.2f|\n",
                    transaction.dateTime,
                    transaction.credit,
                    transaction.amount,
                    transaction.endingBalance
            );
        }
        System.out.printf(Line);

    }

    public void btnWithdrawOnAction(ActionEvent actionEvent) {

        Transaction debitTransaction = new Transaction(false,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),
                accountBalance,
                txtAmount.getValue(),
                accountBalance - txtAmount.getValue());
        double balanceAfterWithdraw = accountBalance - txtAmount.getValue();
        if (balanceAfterWithdraw < 0){
            System.out.println("Insufficient account balance");
            return;
        }
        accountBalance = balanceAfterWithdraw;
        lblBalance.setText(String.format("Balance: Rs. %, .2f",accountBalance));
        System.out.println(txtAmount.getValue() + "withdraw successfully!");
        txtAmount.getValueFactory().setValue(0);
        transactionList.add(debitTransaction);
    }
}
class Transaction{

    boolean credit;
    String dateTime;
    double openingBalance;
    double amount;
    double endingBalance;

    public Transaction(boolean credit, String dateTime, double openingBalance, double amount, double endingBalance) {
        this.credit = credit;
        this.dateTime = dateTime;
        this.openingBalance = openingBalance;
        this.amount = amount;
        this.endingBalance = endingBalance;
    }
}

