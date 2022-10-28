package hoemwork_week_7;

import java.util.Scanner;

/**
 * Write java programme to input any two numbers and ask use to enter their symbol (+, -, /, *)
 * find Addition, substraction, multiplication and division according to their symbol (using if else)
 */
public class Programme_10DoOperationWithSymbol {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the seconfd number: ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / :");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        scanner.close(); //closing the scanner object

    }

    //Calculating opration based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if(symbol == '+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if(symbol == '-'){
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if(symbol == '*'){
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if(symbol == '/'){
            System.out.println(x + " / " + y + " = " + (x / y));
        } else{
            System.out.println("Please Enter correct symbol +,-,*,/");
        }
    }

}
