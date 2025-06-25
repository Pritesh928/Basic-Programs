import java.util.*;

public class Studentscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String score = num1 > 80 ? "High" : ( num1 > 50 ? "Moderate" : "Low" );
        System.out.println("The Students score is " + score);
    }
}
