import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        //displayDivisionResult(10);

        //displayCountDown(5);

        //readNumber(12);

        /*
        int adding = addTwoNumbers(3,5);
        System.out.println("Answer: " + adding);
         */

        //convertToNumber("hello");

        //areaOfParallelogram(3, 5);

        //readName();

        //readPrice();

        //readMessage();

        readSingleDigit();

    }

    static void displayDivisionResult(int num) {
        int divideNum = num / 2;
        System.out.println(num + " divided by 2 is: " + divideNum);
    }

    static void displayCountDown(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }

    static void readNumber(int num) {
        System.out.print("Enter a number: ");
        int userInput = stdin.nextInt();
        System.out.print("You entered the number: " + userInput);
    }

    // Exercise 4 - As don't want to create another repo for this exercise :)
    // ----------------------------------------------------------------------

     static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    static int convertToNumber(String textToNumber) {

        try {
            return Integer.parseInt(textToNumber);
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid number: " + textToNumber);
            System.out.println("Error: " + e.getMessage());  // Prints the exception message
            e.printStackTrace();  // Prints the stack trace for debugging
            return 0;
        }
    }

    static double areaOfParallelogram(double base, double height) {
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
        return area;
    }

    // Exercise 5 - As don't want to create another repo for this exercise :)
    // ----------------------------------------------------------------------

    static String readName() {
        System.out.print("Enter your name: ");
        String userInput =  stdin.next();
        System.out.println("Your name is: " + userInput);
        return userInput;
    }

    static double readPrice() {
        System.out.print("Enter the price of the product: ");
        double price = stdin.nextDouble();
        if (price < 0) {
            System.out.println("You entered an invalid price: " + price);
            return 0;
        } else {
            System.out.println("The price is: " + price);
            return price;
        }
    }

    static String readMessage() {
        System.out.print("Enter your name: ");
        String userInput =  stdin.next();
        String str = String.format("Hi %s", userInput);
        System.out.println(str);
        return str;
    }

    // Exercise 6 - As don't want to create another repo for this exercise :)
    // ----------------------------------------------------------------------


    // A function that checks if a number is double digits and asks user to try again. It checks for both positive and negative numbers.
    static int readSingleDigit() {
        System.out.print("Enter your single digit: ");
        int userInput = Integer.parseInt(stdin.next());

        while (true) {
            if (userInput >= 10 || userInput <= -10)
            {
                System.out.print("You entered double digit: " + userInput + "\nPlease try again: ");
                userInput = Integer.parseInt(stdin.next());

            } else {
                System.out.print("Your number is valid: " + userInput);
                return userInput;
            }
        }
    }


}