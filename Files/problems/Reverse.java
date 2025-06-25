import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int reverse = reverse(n);
        System.out.println(reverse);
        
    }
    public static int reverse(int n){
        int nnew = 0;
        while(n > 0){
            int digit = n % 10;
            nnew = nnew * 10 + digit;
            n /= 10;
        }
        return nnew;

    }
}
