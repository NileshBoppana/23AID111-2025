import java.util.Scanner;

public class Student {
    String name;
    int marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create object
        Student s = new Student();

        // assign values
        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        // display details
        System.out.println("Student Name: " + s.name);
        System.out.println("Marks: " + s.marks);
    }
}