public class Demo23 {
    public static void main(String[] args) {
        
    }
}

// final class MyLeafClass {

// }

// class MyChildClass2 extends MyLeafClass {

// } 


class MyNormalParentClass {
    void print() {
        System.out.println("Hooray!");

    }

    static final void execute(){        //Leaf Methods

    }

    final void execute2(){

    }

    class MyNormalChildClass extends MyNormalParentClass {
        void print(){
            
        }
    }
}
