import java.util.*;
public class Oddtillano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oddno(n));

    }
    public static int oddno(int n){
        int i = 1;
        int sum = 0;
        while(i < n){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }

        return i;
    }
}
