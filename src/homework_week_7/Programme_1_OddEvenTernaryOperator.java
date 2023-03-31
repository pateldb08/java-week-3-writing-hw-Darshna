package homework_week_7;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
import java.util.Scanner;
public class Programme_1_OddEvenTernaryOperator{

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);   //Scanner declaration for reading input form console
              System.out.println("Please enter the number:");
                int number = scanner.nextInt();
               isItOddOrEvenNumber(number);
               Scanner closed;        // closing the scanner object
    }
    public static void isItOddOrEvenNumber(int number){  // checking the number is odd or even
        String evenOrodd = (number%2==0) ? "Even" : "Odd";
        System.out.println(" The " + number + " is " + evenOrodd + " number ");
    }

}
