import java.util.*;
public class Reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int reverse = reverseno(num1);
        System.out.println(reverse);

    }
    public static int reverseno(int num1){
        int newnum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            newnum = newnum*10+digit;
            num1 = num1 / 10;
        }
        return newnum;
    }
}
