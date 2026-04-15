package tools;
public class Employee{
    public static void main(String[] args) {
        int baseSalary = 35000;
        int bonus = baseSalary + 4000;
        if(baseSalary>30000){
            System.out.println("Base Salary:" + baseSalary);
            System.out.println("Bonus Applied: 4000");
            System.out.println("Total Salary:" + bonus);
        }else{
            System.out.println("Base Salary:" + baseSalary);
            System.out.println("Bonus Applied: No Bonus");
            System.out.println("Total Salary:" + baseSalary);  
        }
    }
}