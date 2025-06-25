import java.util.*;
public class SimpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number ");
        int num2 = sc.nextInt();
        System.out.println("Press Switch (1 for Addition)/(2 for Substraction)/(3 for Multiplication)/(4 for division)/(5 for Modulus)");
        int oper = sc.nextInt();
        switch(oper){
            case 1 :
                System.out.println("The Addition of two number is " + (num1 + num2));
                break;
            case 2 :
                System.out.println("The Substraction of two number is " + (num1 - num2));
                break;
            case 3 :
                System.out.println("The Multiplication of two number is " + (num1 * num2));
                break;
            case 4 :
                System.out.println("The Division of two number is " + (num1 / num2));
                break;
            case 5 :
                System.out.println("The Modulus of two number is " + (num1 % num2));
                break;
            default :
                System.out.println("Invalid operator");
        }
        
    }    
}
