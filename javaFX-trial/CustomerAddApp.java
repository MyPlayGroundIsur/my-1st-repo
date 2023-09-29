// public class CustomerAddApp {
//     public static void main(String[] args) {
        

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.tm.Customer;

import java.io.*;

public class MainSceneController {
    public AnchorPane root;
    public Button btnNewCustomer;
    public Button btnSave;
    public Button btnRemove;
    public TableView<Customer> tblCustomer;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;

    public void initialize() throws IOException {

        btnSave.setDefaultButton(true);

        //column mapping[step 5]
        tblCustomer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));

        //add listener to the table and set select item to the fields[step 6]
        tblCustomer.getSelectionModel().selectedItemProperty().addListener(((value,previous , current) ->{
            if(current != null){
                txtId.setText(current.getId());
                txtName.setText(current.getName());
                txtAddress.setText(current.getAddress());
            }
        } ));


        File file = new File("customer.dep");
        if(!file.exists()) file.createNewFile();

        ObservableList<Customer> itemsList = tblCustomer.getItems();

        /*---------------------------------------[load all the data saved]----------------------------------------------*/

        ObjectInputStream ois = null;
        try{
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            while(true){
               itemsList.add((Customer) ois.readObject());
            }
        } catch (EOFException e) {
            // Do nothing
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
        } finally {
            if (ois != null) ois.close();
            tblCustomer.refresh();
        }
    }

    public void btnNewCustomerOnAction(ActionEvent actionEvent) {

        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtId.requestFocus();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) throws IOException {

        if (txtId.getText().strip().isBlank()){
            txtId.requestFocus();
            txtId.selectAll();
            return;
        } else if (txtName.getText().strip().isBlank()) {
            txtName.requestFocus();
            txtName.selectAll();
            return;
        } else if (txtAddress.getText().strip().isBlank()) {
            txtAddress.requestFocus();
            txtAddress.selectAll();
            return;
        }
        String id = txtId.getText();
        String name =txtName.getText();
        String address = txtAddress.getText();

        //create instance from class[step 2]
        Customer customer = new Customer(id, name, address);

        //get the observable list[step 3]
        ObservableList<Customer> itemsList = tblCustomer.getItems();

        //add instance to the observable list[step 4]
        itemsList.add(customer);
        btnNewCustomer.fire();


        File file = new File("customer.dep");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ObservableList<Customer> customerList = tblCustomer.getItems();

        try{
            for (Customer customers :customerList) {
                oos.writeObject(customers);
            }
        }finally {
            oos.close();
        }
    }

    public void btnRemoveOnAction(ActionEvent actionEvent) throws IOException {

        //get the observable list to delete customer
        ObservableList<Customer> customerList = tblCustomer.getItems();

        //get the selected customer
        Customer selectedCustomer = tblCustomer.getSelectionModel().getSelectedItem();

        customerList.remove(selectedCustomer);
        File file = new File("customer.dep");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try{
            for (Customer customers :customerList) {
                oos.writeObject(customers);
            }
        }finally {
            oos.close();
        }
        btnNewCustomer.fire();

    }
}

    

