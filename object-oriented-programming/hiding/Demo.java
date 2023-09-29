package hiding;

public class Demo {
    public static void main(String[] args) {
        new Dream().myMethod();
    }
}

class SuperClass {
    public static void execute(){
        System.out.println("Super Class");
    }
    static{
        System.out.println("Super Class is being initialized");
    }
}

class Dream extends SuperClass implements Idea1, Idea2 {
    static {
        System.out.println("Dream class is being initialized");
    }
}

interface SuperIdea {
    public static void execute(){
        System.out.println("Super Idea");
    }
}

interface Idea1 extends SuperIdea {
    public static void execute(){
        System.out.println("Idea1 is an extension of the Super Idea");
    }
    public default void myMethod(){
        myPrivateMethod();
    }

    private void myPrivateMethod(){
        System.out.println("My Private Method");
    }
}

interface Idea2 {
    int x = getX();
    int y = getY();
    static int getX(){
        System.out.println("getX()");
        return 10;
    }
    static int getY(){
        System.out.println("getY()");
        return 10;
    }
    public static void execute(){
        System.out.println("Idea2");
    }
}