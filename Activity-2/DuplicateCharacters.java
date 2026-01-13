import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[256]; // for ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        System.out.println("Duplicate characters are:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " → " + count[i] + " times");
            }
        }

        sc.close();
    }
}