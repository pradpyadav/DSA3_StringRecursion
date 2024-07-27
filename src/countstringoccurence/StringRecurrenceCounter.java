package countstringoccurence;

import java.util.Scanner;

public class StringRecurrenceCounter {
    public static void main(String[] args) {

        System.out.println("Welcome to string occurence Calculator");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter inputString: ");
        String inputString = scan.next();

        System.out.println("Enter targetString: ");
        String targetString = scan.next();

        System.out.println("Input String : "+inputString);
        System.out.println("Target String : "+targetString);

        System.out.println("Calculating string occurence value : "+countStringOccurence(inputString,targetString));

    }

    static  int countStringOccurence(String inputString, String targetString){
      return countstringOccurenceHelper(inputString,targetString,0);
    }

    static int countstringOccurenceHelper(String inputString, String targetString, int idx) {

        //Base Condition to check if the index has gone past the threshhold length
        if(idx > inputString.length()-targetString.length())
            return 0;//this means we didnot get any string match

        int subStringCountResult = countstringOccurenceHelper(inputString,targetString,idx+1);

        //comparing the starting string for equality if eaual add it to th eresult else return the result
        boolean doStartStringMatch = inputString.substring(idx, idx+targetString.length()).equals(targetString);
        if(doStartStringMatch)
            return subStringCountResult+1;
        else
            return subStringCountResult;

    }


}
