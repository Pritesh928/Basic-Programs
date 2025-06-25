import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = gcdno(num1, num2);
        System.out.println(gcd);

    }
    public static int gcdno(int first,int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while(i <= least){
            if(first % i ==0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int first,int second){
        if(first < second){
            return first;
        }else{
            return second;
        }
    }
}
// gcd means the no which divides more no in between two table.
//for e.g 2,4 -----the no which seen in both no or the no which is max divisible on both numbers factor.
// 2 - 1,(2)..
// 4 - 1,(2),4..
