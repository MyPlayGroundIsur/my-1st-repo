public class Demo13 {
    public static void main(String[] args) {
      Child child = new Child();

    }
}

class Parent extends Object{
    static int x;


    static{
        System.out.println("Parent class is being initialized");
    }

    int y;

    static void myStaticMethod(){}

    void myInstanceMethod(){}

}

class Child extends Parent {

    static{
        System.out.println("Child class is being initialized");
    }
    int a;
    void myMethod(){}

}
