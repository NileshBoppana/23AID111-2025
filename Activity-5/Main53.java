import java.util.Scanner;

class Student {
    String name;
    int age;
    int marks;

    Student() {
        name = "John";
        age = 18;
        marks = 75;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Main53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("Default Values:");
        s1.display();

        System.out.println("Enter new name, age and marks:");
        s1.name = sc.nextLine();
        s1.age = sc.nextInt();
        s1.marks = sc.nextInt();

        System.out.println("Updated Values:");
        s1.display();
    }
}