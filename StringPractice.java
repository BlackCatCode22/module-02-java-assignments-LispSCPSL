// Tyler Dupree
// 08/27
// StringPractice.java


import java.sql.SQLSyntaxErrorException;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my String Practice Program!\n");

        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Hello From My STRING Practice Program!";

        System.out.println("\n myPracticeStr is : " + myPracticeStr);

        // Use a few String methods
        // a method is a object-oriented language name for a function
        // methods always have a pair of () attached to them
        //
        // Use the toLowerCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // Prove it...
        System.out.println("myNewStr is: " + myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);

        // use the length method
        // Create an int variable, because the length() method returns an int.
        int myInt = 0;


        // Find the length of our string object.

        myInt = myPracticeStr.length();
        // Prove it!
        System.out.println("\n The length of " + myPracticeStr + " is " + myInt);

        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");

        //Prove it!
        System.out.println("\n The value of isItThere is: " + isItThere);

        // charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);
        // Output the result
        System.out.println("\n The char at index " + anotherInt + " is " + myChar);

        // .indexOf
        int mySecondInt;

        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\n The index of Str is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;

        oneMoreInt = myPracticeStr.lastIndexOf("m");
        System.out.println("\n oneMoreInt is: " + oneMoreInt);

        // SubString!!
        String myLastStrObject;

        myLastStrObject = myPracticeStr.substring(0,myPracticeStr.indexOf("STR"));

        // Output that!
        System.out.println("\n myLastStrObject is: " + myLastStrObject);








    }


}