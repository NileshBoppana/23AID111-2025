public class ProcessNumbers {
    public static void main(String[] args) {
        String[] inputs = {"10", "20", "abc", "30", "4x", "40"};

        for (int i = 0; i < inputs.length; i++) {
            try {
                int num = Integer.parseInt(inputs[i]);
                System.out.println("Processed number: " + num);
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input at index " + i + ": " + inputs[i]);
            }
        }

        System.out.println("Processing completed.");
    }
}