public class Demo22 {
    public static void main(String[] args) {
        new MyChildClass();
        new MyChildClass(10);
        new MyChildClass(10, "IJSE");

    }
}

class MyParentClass{

}

class MyChildClass extends MyParentClass {
    {
        System.out.println("I am being initialized");
    }
    public MyChildClass(){
        this(10);
        System.out.println("MyChildClass");
    }

    public MyChildClass (int id){
        super();
    }

    public MyChildClass(int id , String name) {
        super();
    }
}
