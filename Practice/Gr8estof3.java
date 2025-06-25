import java.util.*;

public class Gr8estof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2){
            System.out.println("The Greatest No is " + num1);
        }else if(num2 > num3){
            System.out.println("The Greatest No is " + num2);
        }else{
            System.out.println("The Greatest No is " + num3);
        }
    }
}
