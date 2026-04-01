public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } 
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}