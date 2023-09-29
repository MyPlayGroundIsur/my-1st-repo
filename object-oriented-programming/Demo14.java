import java.lang.reflect.Field;
import java.util.Vector;

public class Demo14 {
    public static void main(String[] args) {
        ClassLoader classLoader = Demo14.class.getClassLoader();
        Field hiddenField = ClassLoader.class.getDeclaredField("classes");
        hiddenField.setAccessible(true);
        Vector<Class<?>> loadedClasses =(Vector<Class<?>>) hiddenField.get(classLoader);
        System.out.println(MyChild.x);
    }
}

class MyParent {
    static int x = 10;
     static {
        System.out.println("MyParent Class is being initialized");
    }
}

class MyChild extends MyParent{
    static int y = 20;
    static {
        System.out.println("MyChild Class is being initialized");
    }
}
