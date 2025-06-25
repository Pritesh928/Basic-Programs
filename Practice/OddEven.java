import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even no");
        }else {
            System.out.println("Odd no");
        }
    }
}
