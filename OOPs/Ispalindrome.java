import java.util.Scanner;
public class Ispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        if(ispali(num1, num1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
    public static boolean ispali(int newnum,int num1){
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
