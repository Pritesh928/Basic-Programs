import java.util.*;
public class Basicprogramsin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.Good morning printing program.
        System.out.println(">>Welcome in Good morning printing program");
        System.out.println("Good Morning");
        //2.Subscribe printing program.
        System.out.println(">>Welcome in Subscribe printing program");
        System.out.println("Subscribe to Nobody :)");
        //3.Normal Star Patterns print.
        System.out.println(">>Welcome in Normal star pattern print");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        //4.Star patterns using escape sequences.
        System.out.println(">>Welcome in  Star patterns using escape sequences");
        System.out.println("***\n **\n  *");
        //5.Welcome program using input.
        System.out.println(">>Welcome in welcome program using input");
        System.out.println("Enter Your name ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        //6.Sum of two numbers Program.
        System.out.println(">>Welcome in Sum of two numbers");
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println(">>Welcome in The sum of two numbers is " + sum);
        //7.Swapping of numbers program.
        System.out.println(">>Welcome in Swapping of numbers program.");
        System.out.println("Enter Two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The numbers after Swapping is ");
        System.out.println(a);
        System.out.println(b);
        //8.Arithmetic sums of values;
        System.out.println(">>Welcome in Arithmetic sum of values");
        System.out.println("Enter two numbers");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Sum is " + (c + d) );
        System.out.println("substraction is " + (c - d));
        System.out.println("multiplication is " +(c * d));
        System.out.println("division is " +(c / d));
        System.out.println("modulo is " +(c % d));
        //9.floating no multiplications
        System.out.println(">>Welcome in floating no multiplications");
        System.out.println("Enter two numbers");
        float e = sc.nextInt();
        float f = sc.nextInt();
        float multiplication;
        multiplication = e * f;
        System.out.println("The multiply of two floating no is " + multiplication);
        //10.Perimetre of rectangle calculating program
        System.out.println(">>Welcome in Perimeter of rectangle calculating program");
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();
        int perimetre;
        perimetre = length*2 + breadth*2;
        System.out.println("The perimeter of rectangle is " + perimetre);
        //11.triangle area calculation program
        System.out.println(">>Welcome in triangle area calculation program");
        System.out.println("Enter the base of triangle");
        double base = sc.nextDouble();
        System.out.println("Enter height of triangle");
        double height = sc.nextDouble();
        double areaoftriangle;
        areaoftriangle = 0.5*base*height;
        System.out.println("The area of triangle " + areaoftriangle);
        //12 and 13.Simple and compound interest program 
        System.out.println(">>Welcome in Simple and Compound interest program");
        System.out.println("Enter the principal of interest");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest"); //in percentage
        int rate = sc.nextInt();
        System.out.println("Enter the time for interest"); //in hours
        int time = sc.nextInt();
        int simpleinterest = (principal*rate*time) / 100;
        int compoundinterest = principal*(1 + rate / 100)*time;
        System.out.println("Simple interest is " + simpleinterest);
        System.out.println("Compound interest is " + compoundinterest);
        //14.Farenheit to celcius converting program
        System.out.println(">>Welcome in Farenheit to celcius converting program");
        System.out.println("Enter the temperature"); //In farenheit
        double farenheit = sc.nextInt();
        double celcius = (farenheit - 32)*5/9;
        System.out.println("The converted tempreature is " + celcius);
        //15.Postive negative or zero program
        System.out.println(">>Welcome in Ispositive or Isnegative or Iszero program");
        System.out.println("Enter a number");
        int g = sc.nextInt();
        if(g > 0){
            System.out.println("The number is positive");
        }else if(g < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }
        //>>Welcome to radius to circumference and area program
        double radius;
        double circumference;
        double area;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        System.out.printf("Circumference of circle %d",circumference);
        System.out.printf("Area of circle is %d",area);

    }
}
