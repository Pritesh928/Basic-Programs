import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number");
        int num1 = sc.nextInt();
        if(palindrome(num1, num1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
    public static boolean palindrome(int newnum , int num1){
        return pale(newnum) == num1;

    }
    public static int pale(int num1){
        int newnum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            newnum = newnum * 10 + digit;
            num1 = num1 / 10;
        }
        return newnum;

    }
}
