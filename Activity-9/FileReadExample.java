import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int number = Integer.parseInt(line);
                System.out.println(number);
            }

            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file.");
        } 
        finally {
            System.out.println("Program executed.");
        }
    }
}