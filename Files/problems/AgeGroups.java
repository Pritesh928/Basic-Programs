import java.util.*;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if(age <= 13){
            System.out.println("You Are Child");
        }else if ( age <= 20){
            System.out.println("You are a Teenager");
        }else if ( age <= 60 ){
            System.out.println("You are a adult");
        }else{
            System.out.println("You are a Senior Citizen");
        }
        
    }
}
