import java.util.Scanner;

public class Employee {
    public int id;
    public String name;
    public double salary;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter id: ");
        emp.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter salary: ");
        emp.salary = sc.nextDouble();

        emp.display();
    }
}