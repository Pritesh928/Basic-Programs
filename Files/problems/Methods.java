import java.util.*;
public class Methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1 = sc.nextInt();
        int i = 0;
        int num2 = 0;
        System.out.println("The Table of " + num1);
        while(i <= 10){
            System.out.println(num2);
            i++;
            num2 = num1 * i;
            
        }


    }
}
