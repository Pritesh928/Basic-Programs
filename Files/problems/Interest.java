import java.util.*;
public class Interest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        double principalamount = sc.nextDouble();
        double rateofinterest = sc.nextDouble();   //in percentage
        double time = sc.nextDouble(); // years
        // double simpleinterest;
        // simpleinterest =(principalamount*time*rateofinterest)/100;
        // System.out.println(simpleinterest);
           double compoundinterest;
           //compound interest formulae = P(1 + R/100)^T
           compoundinterest = principalamount*(1 + rateofinterest / 100)*time;
           System.out.println(compoundinterest);


    }
}
