import java.util.*;
public class Ispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        boolean palindrome =ispalindrome(num1);
        if(palindrome){
            System.out.println("a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean ispalindrome(int num1){
        return num1 == reverse(num1);
    }
    public static int reverse(int num1){
        int newnum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            newnum = newnum *10 + digit;
            num1 /= 10;
        }
        return newnum;
    }
}
