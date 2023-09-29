public class Demo4 {
    static int x = 5;

    public Demo4(){
        super();
        //Invisible line
        System.out.println("Constructor body");
    }
    {
        System.out.println("Object is being initialized");
    }
    void print(){
        int x = 10;
        System.out.println(x);
    }

    static{
        System.out.println("Demo is being initialized");
    }
    public static void main(String[] args) {
        new Demo4().print();
        
    }
}
