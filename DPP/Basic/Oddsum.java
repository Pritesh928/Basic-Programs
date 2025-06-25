import java.util.*;
public class Oddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int oddsum = oddno(N);
        System.out.println("The sum of all odd numbers are " + oddsum);
    }
    public static int oddno(int N){
        int k = 0;
        int sum = 0;
        while(k < N){
           if(k % 2 != 0){
            sum += k;
           }
           k++;
        }
        return sum;
    }
}
