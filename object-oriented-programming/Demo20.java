public class Demo20 {
    public static void main(String[] args) {
        MyChild2 mc = new MyChild2("abc");
        mc.doSomething(20);
    }
}

class MySuper2{
    int x = 10;
    void abc(){
        ((MyChild2)(this)).print(((MyChild2)(this)).x);

    }

}

class MyChild2 extends MySuper2{
    static String x;
    MyChild2(String x) {
        this.x = x;
    }
    void print(Object x){
        System.out.println(x);

    }
    void doSomething(double x){
        super.abc();
    }
}