import java.util.Scanner;
public class Radiitocircumference {
    public static void main(String[] args) {
        //Basic version
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double circumference;
        circumference = 2 *Math.PI*radius;
        System.out.print("The circumference of circle with radius " + radius + " is: " + circumference);
    }
}
