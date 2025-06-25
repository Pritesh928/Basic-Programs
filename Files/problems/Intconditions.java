import java.util.*;
public class Intconditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        if(num1 < 0){
            System.out.println("Negative");
        }else if (num1 > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    } 
