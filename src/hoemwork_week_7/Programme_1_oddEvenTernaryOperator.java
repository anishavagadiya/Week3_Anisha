package hoemwork_week_7;

import java.util.Scanner;

/**
 * 1.Write a java programme that tells us that Input number is odd or even?
 * HINT: Use ternary Operator(? :)
 */

public class Programme_1_oddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddorEvenNumber(number);
        //closing the scanner object
      scanner.close();
    }
//Checking the nimber is odd or even
    private static void isItOddorEvenNumber(int number) {
        //ternary operator is used
        java.lang.String evenorOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenorOdd + " number");
    }


}
