import java.util.*;

public class Farenheittocelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature"); // IN Farenheit..
        double farenheit = sc.nextLong();
        double celcius;
        celcius = (farenheit-32)*5/9;
        System.out.println(celcius);
    }
}
