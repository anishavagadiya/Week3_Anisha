package hoemwork_week_7;
/**
 * write the java programme which input any number between 1 to 7 and it print the days name MONDAY, TUESDAY..
 * SUNDAY of the week acordingly by using switch.
 * NOTE: if number is out of selection print message "week contain 1 to 7 days"
 */

import java.util.Scanner;

public class Programme_13_FindTheDayName{
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number between 1 and 7: ");
        int day =scanner.nextInt();
        findTheDaysName(day);
        scanner.close(); //closing the scanner

    }
    public static void findTheDaysName(int day){
    //finding the name of the day
        switch (day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
        }
    }


