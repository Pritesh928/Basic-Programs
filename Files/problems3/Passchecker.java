import java.util.*;
public class Passchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.println("Enter a password");
            pass = sc.nextLine();
        }
        while(pass.length() < 6);
        System.out.println("Your Password is " + pass); 
    }
}
