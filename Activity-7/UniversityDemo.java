class Person {
    Person() {
        System.out.println("A person works to live.");
    }
}
class Student extends Person {
    Student() {
        super();
        System.out.println("A Student studies to gain knowledge.");
    }
}
class Research_Student extends Student {
    Research_Student() {
        System.out.println("A Research Student gains knowledge and do researches.");
    }
}
public class UniversityDemo{
    public static void main(String[] args) {
    Research_Student r1= new Research_Student();
    }
}