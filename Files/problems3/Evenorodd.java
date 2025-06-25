import java.util.*;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        String even = num1 % 2 == 0 ? "Even" : "Odd";
        System.out.println(even);
    }
}
