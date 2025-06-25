import java.util.*;
public class Fibono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        fibono(num1);
    }
    public static void fibono(int num1){
        if(num1 < 0) return;
        System.out.println("0 ");
        if(num1 == 0) return;
        System.out.println("1 ");
        int first = 0; int second = 1;
        while(first + second <= num1){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;

        }
    }
}
