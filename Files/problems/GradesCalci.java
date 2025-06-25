import java.util.*;
public class GradesCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage ");
        int percentage = sc.nextInt(); // In Percentage
        if ( percentage >= 90){
            System.out.println(" You Have Got A Grade!!");
        }else if (percentage >= 75){
            System.out.println("You Have Got B Grade!!");
        }else if( percentage >= 60){
            System.out.println("You Have Got C Grade!!");
        }else if (percentage >= 30){
            System.out.println("You Have Got D Grade!!");
        }else {
            System.out.println("You Have Got F Grade!!");
        }
    }
}
