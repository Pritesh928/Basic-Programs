import java.util.*;
public class FactorialCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println(fact);

    }
    public static long factorial(int num){
          if(num < 2){
            return 1;
          }
          long fact = 1;
          int i = 2;
          while(i<= num){
            fact = fact * i;
            i++;
          }
          return fact;
    }
    
}
