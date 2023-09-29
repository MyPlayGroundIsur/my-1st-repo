package diamond;

public class Demo {
    public static void main(String[] args) {
        
    }
    
}

interface AwesomeIdea {
    // void execute();

}

interface MySuperAwesomeIdea extends AwesomeIdea {
    // default void execute() {
    //     System.out.println("MySuperAwesomeIdea");

    // }

}

interface MyCrazyIdea extends AwesomeIdea {
    // default void execute() {
    //     System.out.println("MyCrazyIdea");
    // }

}

class DreamComeTrue implements MySuperAwesomeIdea, MyCrazyIdea {
  
    public void execute() {
        System.out.println("MyCrazyIdea");

    }
}
