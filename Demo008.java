import java.util.*;
public class DoWhileLoginCredentials {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String username,pass;

    do{

        System.out.println("welcome to mallareddy University,please login");
        System.out.println("Enter Name");
        username = sc.next();
        System.out.println("Enter password");
        pass = sc.next();
        
    }while((!username.equals("rishi"))||(!pass.equals("rishi_019")));
    System.out.println("Successfully logged in.");
    }
}



