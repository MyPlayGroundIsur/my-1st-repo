public class Customer {

    
        
    
    public static  String something = "Hello";
    public int batch = 11;

    /*Object/Instance Initializer */
    {

        System.out.println("Instance Initializer1");
    }

    public Customer (){
        System.out.println("Customer() constructor");
    }
    static {
        System.out.println("Customer class is being initialized");

    }
    public static void doSomething() {
        System.out.printf("%s ",something);
        
    }

    {
        System.out.println("Instance Initializer2");
    }

    public void print(){
        System.out.println("Direct entry prgram"+batch);
    }
}
