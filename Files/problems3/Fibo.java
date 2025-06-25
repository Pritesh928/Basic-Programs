import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("The Series of Fibonacci numbers are");
        printfibo(num1);
    }
    public static void printfibo(int num1){
        // if(num1 < 0){
        //     System.out.println("0 ");
        // }else if(num1 == 0){
        //     System.out.println("1 ");
        // }
        if(num1 < 0)return;
        System.out.print("0 ");
        if(num1 == 0)return;
        System.out.print("1 ");
        int first = 0;
        int second = 1;
        while(first + second < num1){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
