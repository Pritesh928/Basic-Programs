import java.util.*;
public class Occurencesofaelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myarr = Arrayutility.inputarray();
        System.out.println("Enter the number you want to search");
        int search = sc.nextInt();
        int occ = occurences(myarr, search);
        System.out.println("Your element Found " + occ + " time in the array");
    }
    public static int occurences(int [] myarr , int search){
        int occ = 0;
        for(int num1 : myarr){
            if(num1 == search){
                occ++;
            }
        }
        return occ;
    }
}
