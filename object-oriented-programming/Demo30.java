import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo30 {
    public static void main(String[] args) {
        
    }
}

abstract class myAbstractClass {
    protected abstract void myMethod();     //Protected can be used in abstarct method in abstract class
    abstract void myMethod2();          //Package private can be used in abstarct method in abstract class
}

// interfaces are implicitly abstract  and static
abstract interface MyInterface {     //IMyInterface
    // public abstract void myMethod();
    abstract void myMethod();       //This is still a public method
    // protected abstract void myMethod();      //Protected can't be used with abstract method
}

interface MyInterface2 extends MyInterface, Serializable, Consumer {
    void myMethod2();
}

class MyConcreteClass implements MyInterface2, Runnable, BiFunction {

    @Override
    public void myMethod () {}
     
    @Override
    public void myMethod2 () {}

    @Override
    public void accept(Object t) {}

    @Override
    public void run () {}

    // @Override
    // public Object apply(Object t, Object u) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'apply'");
    // }
}

