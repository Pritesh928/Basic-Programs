import java.util.*;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int n = sc.nextInt();
        printtables(n);

    }
    public static void printtables(int n){
        int i= 1;
        while(i <=10){
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }
}
