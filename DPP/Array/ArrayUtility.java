import java.util.*;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        //Array program for taking all element as input.
        System.out.println("Please enter no of element");
        int size = sc.nextInt();
        int[] myarr = new int[size];
        int i = 0;
        while(i < size){
            System.out.println("Please enter element no " + (i + 1));
            myarr[i] = sc.nextInt();
            i++;
        }
        return myarr;
    }
    public static int[][] input2Darray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Please enter no of columns");
        int columns = sc.nextInt();
        int[][] myarr = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns){
                System.out.println("Please enter element row " + (i + 1) + ", column: "  + (j + 1) + " : ");
                myarr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return myarr;
    }
    public static void displayarray(int [] myarr){
        int i = 0;
        while(i < myarr.length){
            System.out.println(myarr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
