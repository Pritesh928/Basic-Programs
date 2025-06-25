import java.util.*;
public class Noguessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 5;
        int number;
        do{
            System.out.println("Guess the number between 1 to 10");
            number = sc.nextInt();
        }
        while(number != num1);
        System.out.println("You guessed it correctly");
    }
}
