import java.util.*;

public class GradeCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");//In Percentage
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Your Grade is A");
        }else if(marks >= 75 ){
            System.out.println("Your Grade is B");
        }else if( marks >= 60){
            System.out.println("Your Grade is C ");
        }else if(marks >=30){
            System.out.println("Your Grade is D");
        }else {
            System.out.println("Your Grade is F");
        }
    }
}
