import java.util.Scanner;

class Student {
    public String name;
    public int marks;
}

public class StudentTopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Enter name: ");
            s[i].name = sc.nextLine();
            System.out.print("Enter marks: ");
            s[i].marks = sc.nextInt();
            sc.nextLine();
        }

        Student topper = s[0];

        for (int i = 1; i < n; i++) {
            if (s[i].marks > topper.marks) {
                topper = s[i];
            }
        }

        System.out.println("Topper: " + topper.name);
        System.out.println("Marks: " + topper.marks);
    }
}