import java.util.*;
public class Factorialfunc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();    
     long fact = factorial(num);
     System.out.println(fact);
    // System.out.println("Enter a number");
    // int n = sc.nextInt(); 
    // long fact;
    // fact = n * (n - 1) * (n - 2) * (n - 3);
    // System.out.println("The Factorial of " + n + " = " + fact);   
    
    }
    public static long factorial(int num){
        if(num < 2){
            return 1;
        }     
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
