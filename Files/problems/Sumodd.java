import java.util.*;
public class Sumodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 0;
          int i = 1;
          while( i <= n){
            sum += i;
            i += 2; // Odd no is calculated by starting from 1 and adding 2 in  forward calculations.
          }
          System.out.println("odd sum till " + n + " is " + sum );
        }
}
