import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String n) {
        name = n;
        salary = 0;
    }

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name1 = sc.nextLine();

        Employee e1 = new Employee(name1);

        System.out.println("Enter employee name:");
        String name2 = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        Employee e2 = new Employee(name2, salary);

        System.out.println("\nEmployee 1 Details:");
        e1.display();

        System.out.println("\nEmployee 2 Details:");
        e2.display();
    }
}