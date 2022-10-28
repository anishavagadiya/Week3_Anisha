package hoemwork_week_7;

import java.util.Scanner;

/**
 * Write a programme that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12FindInputValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Character: ");
        char ch = scanner.next().charAt(0);
        Programme_12FindInputValue inputValue = new Programme_12FindInputValue(); //object creation
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        scanner.close(); //closing scanner object
    }
    //find the input value is ALPHABET, DIGIT, and SYMBOL

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
