import java.util.Scanner;
public class Isarmstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        boolean armstrong = isarm(num1);
        if(armstrong){
            System.out.println("Not a armstrong number");
        }else{
            System.out.println("Armstrong number");
        }

    }
    public static boolean isarm(int num1){
        int noofDigits = noofdigit(num1);
        int numcopy = num1;
        int finalnumber = 0;
        while(num1 > 0){
            int lastdigit = num1 % 10;
            num1 = num1 / 10;
            finalnumber += pow(numcopy, finalnumber);
        }
        return finalnumber == numcopy;
    }
    public static int pow(int num,int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num;
            i++;
        }
        return result;
    }
    public static int noofdigit(int num1){
        int digit = 0;
        while(num1 > 0){
            digit++;
            num1 = num1 / 10;
        }
        return digit;
    }
}