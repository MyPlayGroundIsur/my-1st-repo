import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Demo29 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            String msg;
            do {
                System.out.print("Enter your message: ");
                msg = SCANNER.nextLine();
            } while (msg.isBlank());
            System.out.println();
            System.out.println("1. File");
            System.out.println("2. Console");
            int option;
            do {
                System.out.print("Where do you want to write your message? ");
                option = SCANNER.nextInt(); SCANNER.nextLine();
            } while (option < 1 || option > 2);
            MyWriter writer;
            if (option == 1){
                String filename;
                do {
                    System.out.print("Enter a file name: ");
                    filename = SCANNER.nextLine();
                }while (filename.isBlank());
                writer = new MyFileWriter(filename);
            } else {
                System.out.println("1. RED");
                System.out.println("2. GREEN");
                System.out.println("3. YELLOW");
                System.out.println("4. BLUE");
                int colorOption;
                do {
                    System.out.print("Enter your color option: ");
                    colorOption = SCANNER.nextInt(); SCANNER.nextLine();
                } while (colorOption < 1 || colorOption > 4);
                String[] colors = {"RED", "GREEN", "YELLOW", "BLUE"};
                Color color = Color.valueOf(colors[colorOption - 1]);
                writer = new MyConsoleWriter(color);
            }
            writer.write(msg);
            System.out.println();
        }while (true);
    }
}
abstract class MyWriter {
    public abstract void write(String message);
}
class MyFileWriter extends MyWriter {
    private File file;
    public MyFileWriter(String fileName){
        this.file = new File(fileName);
    }
    @Override
    public void write(String message) {
        try {
            file.createNewFile();
            byte[] bytes = message.getBytes();
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bytes);
            // for (byte b : bytes) {
            //     fos.write(b);
            // }
            fos.close();
        } catch (IOException e) {
            System.out.println("Failed to write the message in the file, try again");
            e.printStackTrace();
        }
    }
}
class MyConsoleWriter extends MyWriter {
    private Color color;
    public MyConsoleWriter(Color color){
        this.color = color;
    }

    @Override
    public void write(String message) {
        System.out.printf("%s%s%s", color.getColor(), message, "\033[0m");
        System.out.printf("%s%s%s \n", color.getColor(), message, "\033[0m");
    }}

enum Color {
    RED("\033[31m"), GREEN("\033[32m"), YELLOW("\033[33m"), BLUE("\033[34m");
    private String color;
    Color(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}