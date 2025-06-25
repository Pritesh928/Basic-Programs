import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A No");
        int first = sc.nextInt();
        System.out.println("Enter another no");
        int second = sc.nextInt();
        System.out.println(gcd(first, second));

    }
    public static int gcd(int first,int second){
        int gcd = 1;
        int i = 2;
        int least = gcc(first, second);
        while(i<= least){
            if(first % i == 0 && second % i ==0 ){
                gcd = 1;
            }
            i++;
    }
        return gcd;
    }
    public static int gcc(int first,int second){
        if(first < second){
            return first;
        }else{
            return second;
        }
    }
}
