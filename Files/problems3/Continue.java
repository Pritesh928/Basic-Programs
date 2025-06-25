import java.util.*;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int num2 = -num1;
        int i = 0;
        int sum = 0;
        while(i <= num1){
            if(i == num2){
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println("The sum of all positive numbers is " + sum);

    }
}
