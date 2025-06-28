





























// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the sides of triangle");
//         double num1 = sc.nextDouble();
//         double num2 = sc.nextDouble();
//         double pythagoraes;
//         pythagoraes = Math.pow(num1, 2) + Math.pow(num2, 2);
//         double pytha = Math.sqrt(pythagoraes);
//         System.out.println(pytha);
        
//     }
// }
//Income tax Calculator.
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         double num1 = sc.nextDouble();
//         double intax = incometaxcalci(num1);
//         System.out.println("You Should pay this amount " + intax + " to the goverment :)");
//     }
//     public static double incometaxcalci(double num1){
//         double tax = 0;
//         if(num1 <= 300000){
//             tax = 0;
//         }else if(num1 <= 600000){
//             tax = num1 * 0.09;
//         }else if(num1 <= 900000){
//             tax = num1 * 0.12;
//         }else if(num1 <= 120000){
//             tax = num1 * 0.15;
//         }else{
//             System.out.println("Sorry i can't calculate :(");
//         }
//         return tax;
//     }
// }
//New switch statement.
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of day");
//         int num1 = sc.nextInt();
//         String day = switch(num1){
//             case 7 -> "Sunday";
//             case 1 -> "Monday";
//             case 2 -> "Tuesday";
//             case 3 -> "Wednesday";
//             case 4 -> "Thursday";
//             case 5 -> "Friday";
//             case 6 -> "Saturday";
//             default -> "Invalid day";
//         };
//         System.out.println(day);
//     }
// }

//Array element occurences.
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] myarr = {21,3,4,4,3,3,4};
//         System.out.print("Enter the number you want to search : ");
//         int num1 = sc.nextInt();
//         int occ = 0;
//         for(int i = 0;i < myarr.length;i++){
//             if(num1 == myarr[i]){
//                 occ++;
//             }
//            }
//            System.out.println("Element " + num1 + " occured " + occ + " times in the array");
//         }
//     }

    
    //Array elements printer.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] myarr = {21,3,4,4,3,3,4};
    //     // System.out.println("Enter the number you want to search");
    //     // int num1 = sc.nextInt();
    //     for(int i = 0;i < myarr.length;i++){
    //         System.out.println("Element no " + i + ": " + myarr[i]);
    //        }
    //     }
// Body mass index of human.
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your weight pls");
//     double weight = sc.nextDouble();// In kg.
//     System.out.println("Enter your height");
//     double height = sc.nextDouble(); // In feet
//     double newheight = height * 0.3048;
//     double BMI = weight / Math.pow(newheight,2 );
//     System.out.println(BMI);
// }
//Minimum of three numbers.
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter three numbers");
//     int num1 = sc.nextInt();
//     int num2 = sc.nextInt();
//     int num3 = sc.nextInt();
//     int min = 0;
//     System.out.println("The min of three numbers is");
//     if(num1 < num2 && num1 < num3){
//         System.out.println(num1);
//     }else if( num2 < num1 && num2 < num3){
//         System.out.println(num2);
//     }else if(num3 < num1 && num3 < num2){
//         System.out.println(num3);
//     }
//    }
// Sum of corresponding elements in array.
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int [] arr1 = {1,23,43};
//     int [] arr2 = {23,4,6};
//     int [] sumarr = new int[arr1.length];

//     for(int i = 0;i < arr1.length;i++){
//         sumarr[i] = arr1[i] + arr2[i];
//     }
//     for(int i = 0; i < sumarr.length;i++){
//         System.out.println("Index " + i + ": " + sumarr[i]);
//     }

// }
//Equal sum of two array in together.
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int [] myarr = {8,10 ,20 ,30, 40 ,5, 6,7};
//     int [] myarr2 = {8,160 ,230 ,350, 460 ,57, 66,76};
//     int first = mya(myarr);
//     int second = mya2(myarr2);
//     System.out.println(first + second);
// }
// public static int mya(int [] myarr){
//     int sum1 = 0;
//     for(int i = 0;i < myarr.length;i++){
//         sum1 += myarr[i];
//     }
//     return sum1;
// }
// public static int mya2(int [] myarr2){
//     int sum2 = 0;
//     for(int j = 0;j < myarr2.length;j++){
//         sum2 += myarr2[j];
//     }
//     return sum2;
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = "Pritesh";
//         System.out.printf("Hello %s ",name);
//         int num1 = 150000;
//         System.out.printf("%,1d",num1);
//         System.out.println(Math.abs(-997));
//         System.out.println(Math.random());
//         System.out.println(Math.ceil(44.65));
//         System.out.println(Math.floor(44.65));
//         System.out.println(Math.round(54.546));
//         System.out.println(Math.max(2, 6));
//         System.out.println(Math.min(2, 6));
//         System.out.println(Math.pow(4, 3));
//         System.out.println(Math.sqrt(6));
//         System.out.println(Math.exp(4));
//         System.out.println(Math.log(4));
//         System.out.println(Math.sin(65));
//         System.out.println(Math.cos(65));
//         System.out.println(Math.tan(65));
    
// }