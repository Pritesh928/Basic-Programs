import java.util.*;
public class Arrayutility {
    public static void main(String[] args) {
    }
    public static int[] inputarray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int size = sc.nextInt();
        int [] myarr = new int[size];
        for(int i = 0;i < size; i++){
            System.out.println("Enter element no " + (i + 1));
            myarr[i] = sc.nextInt();
        }
        return myarr;
    }
}
