import java.util.Scanner;
import model.Student;
import service.StudentManager;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        try {
            System.out.print("Enter Roll No (Integer): ");
            Integer roll = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            Double marks = Double.parseDouble(sc.nextLine());

            Student s = new Student(roll, name, email, course, marks);

            manager.addStudent(s);
            manager.viewStudent(roll);

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        } finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
