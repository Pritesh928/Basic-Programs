import java.util.*;

public class PerimeterRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        int l = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle");
        int b = sc.nextInt();
        int perimeter;
        perimeter = l*2 + b*2;
        System.out.println("The perimeter of Rectangle " + perimeter);
    }
}
