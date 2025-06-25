import java.util.Scanner;
public class Studentdetails {

    String studentname;
    String rollnumber;
    int std;
    int age;
    public Studentdetails(String studentname,String rollnumber,int std,int age){
        this.age = age;
        this.rollnumber = rollnumber;
        this.std = std;
        this.studentname = studentname;
    }
    @Override
    public String toString() {
        return "Student details:{Name: " + studentname + "," 
        + "Age: " + age + "," + "Standard: " + std + ","
        + "Roll number: " + rollnumber + ".}";
    }

    public static void main(String[] args) {
        Studentdetails st = new Studentdetails("Pritesh", "12", 5, 12);
        System.out.println(st);


    } 
}
