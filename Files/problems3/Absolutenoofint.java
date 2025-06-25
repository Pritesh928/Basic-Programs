import java.util.*;
public class Absolutenoofint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2;
        num2 = -num1;
        //Ternary problem statement.
        int absolute = num1 < 0 ? num2 : num1;
        System.out.println("The absolute of the number is " + absolute);
        //If else statement.
        // if(num1 < 0){
        //     System.out.println("The absolute of the number is " + num2);
        // }else{
        //     System.out.println("The absolute of the number is " + num1);
        // }
    }
}
