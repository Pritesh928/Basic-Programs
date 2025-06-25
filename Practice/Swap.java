import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int num1 = sc.nextInt();
        System.out.println("Enter another no");
        int num2 = sc.nextInt();
        int temp ;
        temp = num1; // the container in which we want to store = the value which we ar storing
        num1 = num2;
        num2  = temp;
        System.out.println("The Swapped No are ");
        System.out.println(num1);
        System.out.println(num2);
    }
}
