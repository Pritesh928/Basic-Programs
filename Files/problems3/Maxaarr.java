import java.util.*;
public class Maxaarr {
    public static void main(String[] args){
    int [] arr = Arrayutility.inputarray();
    int max  = Integer.MIN_VALUE;
    for(int num : arr){
        if(max < num){
            max = num;
        }
    }
    System.out.println("The max value in the array is " + max);
    }
}