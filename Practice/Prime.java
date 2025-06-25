import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
        
    }
}
