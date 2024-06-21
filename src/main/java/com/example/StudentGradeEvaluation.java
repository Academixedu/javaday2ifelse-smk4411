
import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        String name = "manoj";
        int age = 28;
        double grade = 88.5;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("grade: " + grade
        );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        System.out.println("Student details, " + inputName + "!");
       
    }
}
