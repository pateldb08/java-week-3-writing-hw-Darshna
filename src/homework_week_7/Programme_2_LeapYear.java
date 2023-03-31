package homework_week_7;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);      //Scanner declaration for reading input form console
        System.out.println("Please enter the Year:");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        // closing the scanner object
        scanner.close();
    }


    public void isItLeapYear(int year) {     // Checking is it leap year or not
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
