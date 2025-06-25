import java.util.Scanner;
public class Isarmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int reverse = reverse(num1);
        System.out.println(reverse);
    }
    public static int reverse(int num1){
        int newnum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            newnum = newnum * 10 + digit;
            num1 = num1 / 10;
        }
        return newnum;
    }
}
