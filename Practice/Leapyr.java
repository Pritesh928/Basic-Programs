import java.util.*;

public class Leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if( yr % 4 == 0 ||( yr % 100 != 0 && yr % 400 == 0)){ //(the yr shoud either divisible by 4) or (it should divisible by 400 and also not divisible by 100).
            System.out.println("Leapyr");
        }else{
            System.out.println("Not a Leapyr");
        }
    }
}
