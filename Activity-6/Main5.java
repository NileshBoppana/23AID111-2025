import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets:");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    valid = false;
                    break;
                }
            }
        }

        if (!st.isEmpty()) {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}