import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int print = sumofdigit(num);
        System.out.println(print);

    }
    public static int sumofdigit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
