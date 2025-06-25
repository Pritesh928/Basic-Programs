import java.util.*;
public class CompoundInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Value");
        double principal = sc.nextDouble();
        System.out.println("Enter time "); //In Years
        double time = sc.nextDouble();
        System.out.println("Enter rate of interest"); //In Percentage.
        double rateofinterest = sc.nextDouble();
        double compoundinterest;
        compoundinterest = (principal*(1 + rateofinterest/100)*time);
        System.out.println(compoundinterest);
    }
}
