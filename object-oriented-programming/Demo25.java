import java.time.LocalDateTime;

public class Demo25 {
    public static void main(String[] args) {
        User adminUser = new AdminUser("prasad", "IJSE_123456");
        User adminUser2 = new AdminUser("Yasendra", "4567890");

        User guestUser = new GuestUser("John", "4561234");

        adminUser.login();
        adminUser2.login();
        guestUser.login();

        
    }
}
enum UserRole {
    ADMIN, GUEST;
}


abstract class User {
    String username;
    String password;
    UserRole role;
    boolean logged;

    public abstract void login();  // abstract class eke body ekak thiyenn ba

    public void logout(){
        if(logged){
            System.out.printf("%s logged out \n",username);
        }else{
            System.out.println("User hasn't logged in yet");
        }
    }

    public void printUserDetails(){
        System.out.printf("username = %s , password = %s , role = %s \n",username,password,role);
    }

}

class AdminUser extends User{
    private String [] passwords = {"IJSE_123456","IJSE_4567890"};

    public AdminUser(String username,String password){
        this.username = username;
        this.password = password;
        this.role = UserRole.ADMIN;
    }

    @Override
    public void login(){
        for(String password : passwords){
            if(password.equals(this.password)){
                System.out.printf("%s logged in at : %s \n",username,LocalDateTime.now());
                return;
            }
        }
        System.out.println("Invalied login credentails");
    }
}
 
class GuestUser extends User{
    private static final String GUEST_PASSWORD = "GUEST_123456";
    public GuestUser(String username,String password){
        this.username = username;
        this.password = password;
        this.role = UserRole.GUEST;
    }

    @Override
    public void login(){
        if(password.equals(GUEST_PASSWORD)){
            System.out.printf("Guest user: %s logged in at : %s \n",username,LocalDateTime.now());
        }else {
            System.out.println("Invailed login credentails");
        }
    }
}

class ItUser extends User {

    //agreement to implement this
    public void login(){

    }
}
