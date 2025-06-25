import java.util.*;
public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String prime = num1 % 2 == 0 ? "Prime no" : "Not a Prime no";
        System.out.println(prime);
    }
}
