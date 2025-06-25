import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int num1 = sc.nextInt();
        if(IsPalindrome(num1, num1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
    public static boolean IsPalindrome(int newnum, int num1){
        return pali(num1) == num1;
    }
    public static int pali(int num1){
        int newnum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            newnum = newnum * 10 + digit;
            num1 = num1 / 10;
        }
        return newnum;
    }

}
