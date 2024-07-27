package palindrome;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println("Enter the string to decide if it is palindrome");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("String entered: "+str);
        System.out.println("IS it Palindrome ? : "+isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        return isPalindromeHelper(str,0,str.length()-1);
    }

    static boolean isPalindromeHelper(String str, int left, int right) {

        if (left >= right) {
            return true;
        }
        if (str.charAt(left) == str.charAt(right)) {
            return isPalindromeHelper(str, left + 1, right - 1);
        }
        return false;
    }
}
