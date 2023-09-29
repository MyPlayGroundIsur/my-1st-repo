public class DemoTask3 {
    public static void main(String[] args) {
        final String myNum = "\033[40;1m";
        final String myNum1 = "\033[40;0m";
        int myInt1 = 456;
        int myInt2 = 7890;
        System.out.printf("(%s123%s),%s-%s \n" ,myNum, myNum1,myInt1,myInt2);
    }
}
