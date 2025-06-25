import java.util.*;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if( age <= 13){
            System.out.println("Child");
        }else if(age <=20){
            System.out.println("Teenager");
        }else if(age <= 60){
            System.out.println("Adult");
        }else{
            System.out.println("Senior Citizen");
        }
        // if(age >= 60){
        //     System.out.println("Senior Citizen");
        // }else if(age <= 60){
        //     System.out.println("Adult");
        // }else if(age <= 20){
        //     System.out.println("Teenager");
        // }else if( age <= 13){
        //     System.out.println("Child");
        // }else{
        //     System.out.println("Wrong age:(");
        // }
    }
}
