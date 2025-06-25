import java.util.*;
public class Onlyoddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("The Odd numbers till " + num1 + " are ");
        printolnyodd(num1);

    }
    public static void printolnyodd(int num1){
        int i = 0;
        while(i < num1){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
