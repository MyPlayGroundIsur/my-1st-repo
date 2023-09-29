package myPackage;

public class Customer {
    private int id;
    String name;
    protected String adddress;
    public String contact;

    protected void print() {
        System.out.printf("id=%s, name=%s, address=%s, contact=%s \n",id, name, adddress, contact);0
    }
}
