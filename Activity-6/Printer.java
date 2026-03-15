import java.util.Scanner;
class Printers{
	void print(int num) {
		System.out.println(num);
	}
	void print(String xyz) {
		System.out.println(xyz);
	}
	void print(int n, String abc) {
		System.out.println("number is " + n + "\nstring is " + abc);
	}
}
public class Printer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int number = sc.nextInt();
		System.out.print("Enter the string - ");
		String text = sc.next();
		
		int index;
		Printers obj = new Printers();
		System.out.println("Enter your choice what do you want to print \n1 - number\n2 - string\n3 - both number and string");
		index = sc.nextInt();
		
		switch(index) {
		case 1 : 
			obj.print(number);
			break;
		case 2 :
			obj.print(text);
			break;
		case 3 : 
			obj.print(index, text);
			break;
		default : 
			System.out.println("Index not found");
		}
		sc.close();
	}

}