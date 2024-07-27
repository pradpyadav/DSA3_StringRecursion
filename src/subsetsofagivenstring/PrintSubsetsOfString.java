package subsetsofagivenstring;

import java.util.Scanner;

public class PrintSubsetsOfString {


    public static void main(String[] args) {
        System.out.println("Welcome to subset of String generator");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the given input String:");
        String inputString = scan.next();

        System.out.println("Thank you!... Now calculating the given subsets of the String");
        printSubSet(inputString);
        System.out.println("Finished printing the subsets for given inputString : "+inputString);
    }

    static void printSubSet(String inputString) {
        printSubsetHelper(inputString, 0, "");
    }

    static void printSubsetHelper(String inputString, int idx, String currenString) {
        //Base condition
        if (idx == inputString.length()) {
            System.out.println(currenString);
            return;
        }

        printSubsetHelper(inputString, idx + 1, currenString + inputString.charAt(idx));
        printSubsetHelper(inputString, idx + 1, currenString);

    }

}
