import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
           System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
