import java.util.Scanner;

public class Complex {
    public double real;
    public double imag;

    public Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex n1 = new Complex();
        Complex n2 = new Complex();

        System.out.print("Enter real part of first number: ");
        n1.real = sc.nextDouble();
        System.out.print("Enter imaginary part of first number: ");
        n1.imag = sc.nextDouble();

        System.out.print("Enter real part of second number: ");
        n2.real = sc.nextDouble();
        System.out.print("Enter imaginary part of second number: ");
        n2.imag = sc.nextDouble();

        Complex calc = new Complex();
        Complex sum = calc.add(n1, n2);

        sum.display();
    }
}