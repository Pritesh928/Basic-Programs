import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fact = factorial(N);
        System.out.println("The factoial of given number is " + fact);
    }
    public static long factorial(int N){
        // if(N == 0){
        //     System.out.println("0");
        // }else if(N ==1) {
        //     System.out.println("1");
        // }
        int i = 2;
        long fac = 1;
        while( i <= N){
            fac *= i;
            i++;
        }
        return fac;

    }
}
