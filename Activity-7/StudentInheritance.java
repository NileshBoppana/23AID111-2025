class Person {
    public String name;
    public int age;
}

class Student extends Person {
    public int marks;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Nilesh";
        s.age = 18;
        s.marks = 92;

        s.display();
    }
}