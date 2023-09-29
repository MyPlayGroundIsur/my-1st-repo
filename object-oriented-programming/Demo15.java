public class Demo15 {
    public static void main(String[] args) {
        C ref = new C();
        System.out.println(ref.x);
    }
}

class A {
    {
        System.out.println("A's instance initializer");
    }

    int x = 10;
    public A() {
        System.out.println("A's construtor");
    }
    static {
        System.out.println("A class is being initialized");
    }
}

class B extends A {

    int x = 20;
    public B() {
        System.out.println("B's construtor");
    }
    static {
        System.out.println("B class is being initialized");
    }

    private void myMethod() throws Exception{
        System.out.println("My1");
    }
}

class C extends B {

    int x = 30;
    public C() {
        System.out.println("C's construtor");
    }
    static {
        System.out.println("C class is being initialized");
    }

    /*private*/public void myMethod() throws /*Throwable*/ClassNotFoundException{
        System.out.println("My2");
    }
}


