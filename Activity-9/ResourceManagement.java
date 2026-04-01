import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagement {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("data.txt");
            br = new BufferedReader(fr);

            String line = br.readLine();
            int number = Integer.parseInt(line);

            int result = 100 / number;

            System.out.println("Result: " + result);
        } 
        catch (IOException e) {
            System.out.println("Error: File handling issue.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid data format.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                System.out.println("Resources released.");
            } 
            catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}