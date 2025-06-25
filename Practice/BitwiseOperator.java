import java.util.*;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 & num2);//And operator
        System.out.println(num1 | num2);//Or operator
        System.out.println(num1 ^ num2);//Xor operator
        System.out.println(num1 << num2);//Left Shift operator
        System.out.println(num1 >> num2);//Right Shift operator

        //Even or odd Using Bitwise Operators
        int no = sc.nextInt();
        if((no & 2) == 2){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
