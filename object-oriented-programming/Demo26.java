public class Demo26 {
    public static void main(String[] args) {
        // new Months();
        Months months = Months.JAN;
        // MonthClone months1 = MonthClone.JAN;
    }
}

enum Months /*extends*/{
    // class Months {
    JAN, FEB, MAR, APR, MAY,JUNE;        //should be at the top of the block

    // int x;

    /*public*/ Months() {           //implecitly private.
        System.out.println("Month Constructor");
    }
    void myMethod() {

    }

    static void myMethod1() {

    }
private int index;
private String fullName;

    Months(int index, String fullName) {
        this.index = index;
        this.fullName = fullName;
    }
}

class MonthClone {
    public static final MonthClone JAN = new MonthClone();
    public static final MonthClone FEB = new MonthClone();
    public static final MonthClone MAR = new MonthClone();
    public static final MonthClone APR = new MonthClone();
    public static final MonthClone MAY = new MonthClone();

    private String fieldName;
    private static int count;

    {
        fieldName = MonthClone.class.getDeclaredFields()[count++].getName();
    }

    // private MonthClone() {
    //     System.out.println("Month Clone Contructor" );
    // }

    @Override
    public String toString() {
        // MonthsClone.class.getDeclaredField(null)
        return fieldName;

    }
    public void print() {
        System.out.printf("month:%s - %s \n", index, fullName);
    }
}


