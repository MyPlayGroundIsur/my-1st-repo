import java.util.Scanner;

public class Assignment3{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;
        final String COLOR_RED_BOLD="\033[32m";
        final String RESET = "\033[0m";


        app:{

        System.out.print("Enter your name");
        name = scanner.nextLine().strip();
        
        if (name.length() == 0){
            System.out.printf("%sName can't be empty%s\n",COLOR_RED_BOLD,RESET);
            break app;


        }
        System.out.print("Enter your age");
        age = scanner.nextInt();

        final String ERROR_MSG = String.format("%s%s%s");

        if ();

        break app;
         
        System.out.print("Enter   subject1");
        subject1 = scanner.nextLine().strip();

        if (subject1.isBlank()){
            System.out.printf(ERROR_MSG, "Subject1 can't be emthy");
            break app;
        }
        else if ( !subject1.startsWith(ERROR_MSG, "Invalid subject1"));
                                                    

    }
    }
}