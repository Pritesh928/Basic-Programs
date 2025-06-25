import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = lcm(num1, num2);
        System.out.println(lcm);

    }
    public static int lcm(int num1,int num2){
        int i = 1;
        while(true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
// lcm is the no which is divisible by both numbers..
//like for 15,20..
// Ans is 60....