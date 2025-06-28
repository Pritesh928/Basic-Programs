import java.util.Scanner;

public class Test{
    public static int inputuser(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int pass;
//     int i = 0;
//     do{
//         System.out.println("Enter Passcode");
//         pass = sc.nextInt();
//     }
//     while(pass == 1234);
//     System.out.println("Your password is " + pass);
// }