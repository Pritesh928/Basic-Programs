import java.util.Scanner;
public class Stringconcatinate {
    public static void main(String[] args) {
        String name = "Pritesh ";
        String surname = "Singh";
        // String fullname = name + surname;
        // System.out.println(fullname);
        String fullname = name.concat(surname);
        System.out.println(fullname.toUpperCase());

    }
}
