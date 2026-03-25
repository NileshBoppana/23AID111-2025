public class Main54 {

    static class Employee {
        String name;
        double salary;

        Employee(String n) {
            name = n;
            salary = 0.0;
        }

        Employee(String n, double s) {
            name = n;
            salary = s;
        }

        void display() {
            System.out.println("Employee: " + name + " | Salary: " + salary);
        }
    }
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice");

        emp1.display();
        emp2.display();
    }
}