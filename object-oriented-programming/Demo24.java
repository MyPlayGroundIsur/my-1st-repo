import myPackage.Customer;

public class Demo24 {
    public static void main(String[] args) {
      CrazyCustomer customer = new CrazyCustomer(); 
    //   customer.id = 1;
    //   customer.name = "Kasun";
    //   customer.adddress = "Galle";
      customer.contact = "077-1234567";
      customer.print();       
    }
}

class CrazyCustomer extends Customer {
    CrazyCustomer(){
    //   id = 1;
    //   name = "Kasun";
      adddress = "Galle";
      contact = "077-1234567";      
    }

    public void print() {
        super.print();
    }
}
