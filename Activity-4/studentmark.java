import java.util.Scanner;

public class studentmark {
    public int mark1;
    public int mark2;
    public int mark3;

    public int total() {
        return mark1 + mark2 + mark3;
    }

    public double average() {
        return total() / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        studentmark s = new studentmark();

        System.out.print("Enter marks of subject 1: ");
        s.mark1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        s.mark2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        s.mark3 = sc.nextInt();

        System.out.println("Total = " + s.total());
        System.out.println("Average = " + s.average());
    }
}