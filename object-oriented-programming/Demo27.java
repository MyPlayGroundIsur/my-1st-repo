import java.util.Scanner;

public class Demo27 {
    public static void main(String[] args) {
        // ServiceType serviceType = ServiceType.CART;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Item Service");
        System.out.println("2. Cart Service");
        System.out.println("3. Report Service");
        int choice;
        do {
            System.out.print("Enter Service Type: ");
            choice   = scanner.nextInt();scanner.nextLine();
            if(choice > 0 && choice <4)break;
        }while (true);
        // ServiceType serviceType = serviceType.ge;

        
    }
}

enum ServiceType{
    ITEM(), CART(), REPORT();

    private int index;
    ServiceType(int index) {
        this.index = index;

    }

    public static ServiceType getService(int index) {
        for (ServiceType type : values()) {
            if ((type.ordinal() + 1)  == index) return type;

        }
        throw new RuntimeException("invalid");
    }
}
