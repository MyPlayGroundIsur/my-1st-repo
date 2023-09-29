public class Demo33 {
    public static void main(String[] args) {
        // MyAwesomeClass awesomeInstance = new MyAwesomeClass();
        // System.out.println(awesomeInstance instance of MyMarkerInterface);

        F f = (x, y) -> x * x + y * y;
        System.out.println(f.execute(3, 4));
        System.out.println(f.execute(5, 2));
    }
}

@FunctionalInterface
interface F {
    int execute (int x, int y);
    // int abc();
    static void doSomething(){}
}

@FunctionalInterface
interface MyFunctionalInterface
    void myOnlyAbstractMethod();
    // void MyFunctionalInterface2();
