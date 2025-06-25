import java.util.*;
public class Onlyevenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("The Even numbers till " + num1 + " are ");
        printevenno(num1);
    }
    public static void printevenno(int num1){
        int i = 0;
        while(i < num1){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
