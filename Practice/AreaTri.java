import java.util.*;
public class AreaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of triangle ");
        double b = sc.nextDouble();
        System.out.println("Enter Height of triangle ");
        double h = sc.nextDouble();
        double Area;
        Area = 0.5*b*h;
        System.out.println("The area of triangle " + Area);
    }
}
