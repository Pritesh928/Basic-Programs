import java.util.*;
public class Minof2noternary {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd number");
    int num2 = sc.nextInt();
    int min = num1 < num2 ? num1 : num2;
    System.out.println("The min of two numbers is " + min);
    }
    
}
