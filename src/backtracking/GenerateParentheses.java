package backtracking;

public class GenerateParentheses {

    public static void main(String[] args) {
        System.out.println("Welcome to generate Parentheses program");

        int num = 3;
        generateParentheses(3, "", 0, 0, 0);
    }

    static void generateParentheses(int n, String curr,
                                    int index, int openCount, int closeCount) {

        if (index == 2 * n) {
            System.out.println(curr);
            return;
        }
        if (openCount < n) {
            curr = curr + "(";
            generateParentheses(n, curr, index + 1, openCount + 1, closeCount);
            curr = curr.substring(0, curr.length() - 1);

        }
        if (closeCount < openCount) {
            curr = curr + ")";
            generateParentheses(n, curr, index + 1, openCount, closeCount + 1);

        }
    }

}

