import java.util.*;
public class SumofDigits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum = sumofdigits(num);
       System.out.println(sum);

    }
    public static int sumofdigits(int num){
        int i = 0;
        while(num > 0){
            i += num % 10;
            num /= 10;

        }
        return i;
    }
}
