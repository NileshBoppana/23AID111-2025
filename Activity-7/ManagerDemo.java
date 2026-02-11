class Employee {
    public int id;
    public String name;
    public double salary;

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    public String department;
    public double bonus;

    public void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.id = 301;
        m.name = "Nilesh";
        m.salary = 75000;
        m.department = "Operations";
        m.bonus = 15000;

        m.displayManager();
    }
}