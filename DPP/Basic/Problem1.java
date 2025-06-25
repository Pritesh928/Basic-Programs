import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //>> Welcome in odd or even program.
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //>>Welcome in Gr8est of 3 no program..
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            System.out.println("The Greatest Number is " + a);
        }else if (b > c){
            System.out.println("The Greatest Number is " + b);
        }else{
            System.out.println("The Greatest Number is " + c);
        }
        //>>Welcome in isLeapyr program.
        int yr = sc.nextInt();
        if(yr % 4 == 0 && yr % 100 != 0 || (yr % 400 == 0)){
            System.out.println("Leap yr");
        }else{
            System.out.println("Not a leapyr");
        }
        //>>Welcome in Grade calci program.
        int marks = sc.nextInt();
        if(marks > 95){
            System.out.println("A Grade");
        }else{
            System.out.println("B Grade");
        }
        //>>Welcome in Age calci program..
        int age = sc.nextInt();
        if(age >= 60){
            System.out.println("Senior citizen");
        }else if(age >= 30){
            System.out.println("Adult");
        }else if(age >= 12){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
        //>>Welcome in Multiplication Table.
        int n = sc.nextInt();
        int i = 1;
         System.out.println("The Table of " + n + " is");
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (i * n));
            i++;
        }
    }
}
