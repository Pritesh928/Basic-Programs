import java.util.*;
public class Break {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String command;
        while(true){
            System.out.println("Enter your command");
            command = sc.next();
            if(command.equalsIgnoreCase("Exit")){
                break;
            }
        }
        System.out.println("You have succesfully Exited");
    }    
}
