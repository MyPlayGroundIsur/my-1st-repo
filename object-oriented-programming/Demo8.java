import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.print();
        
    }
}

class Stack{
    int[] numbers = new int[0];

    

    public Stack(){

    }
    void push (int number){
        int[] temp = new int[numbers.length + 1];
        for(int i=0; i<numbers.length; i++){
            temp[i] = numbers[i];
        }
        temp[temp.length-1] = number;
        numbers = temp;

    }

    void pop(){
        int[] temp = new int[numbers.length - 1];
        for(int i=0; i<numbers.length-1; i++){
            temp[i] = numbers[i];
        }
        // temp[temp.length-1] = number;
        numbers = temp;


    }

    int peek(){return 0;}

    void print(){
        System.out.println(Arrays.toString(numbers));
    }

}
