import java.util.*;
public class FarhenittoCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature pls"); //In Farenheit
        double a =sc.nextDouble();
        double celcius;
        celcius = (a - 32) * 5/9;
        System.out.println(celcius + "'C"); 
    }
}
