import java.util.*;

public class Sumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(oddsum(num));
    }
    public static int oddsum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum = sum + i;
            i = i + 2;
        }
        return sum;



    }
   
}
