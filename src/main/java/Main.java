import HW2.MenuOptions;
import HW2.Mercedes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuOptions menuOptions = MenuOptions.z;
        while (menuOptions != MenuOptions.q)
            try
            {
                menu();
                menuOptions = MenuOptions.valueOf(sc.nextLine());
                switch (menuOptions)
                {
                    case a:
                        System.out.println("Car added");
                        break;
                    case b:
                        System.out.println("Car removed");
                        break;
                    case c:
                        System.out.println("Car showed");
                        break;
                    case d:
                        System.out.println("Car sorted");
                        break;
                    case q:
                        System.out.println("Goodbye.");
                        break;
                    default:
                        System.out.println("Selection out of range. Try again");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Selection out of range. Try again:");
            }
        int[] arrNumbers = getNumbers(sc);
        sumEvenAndOddNumbers(arrNumbers);
        System.out.println("Enter a count of Fibonacci numbers:  ");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciNumbers(fibonacci.setN(sc.nextInt()));
        sc.close();
    }

    public static void menu() {
        System.out.println("\nEnter:");
        System.out.println("\ta. Add car");
        System.out.println("\tb. Remove car");
        System.out.println("\tc. Show car");
        System.out.println("\td. Sort car");
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");

    }

    private static void sumEvenAndOddNumbers(int[] arrNumbers) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int arrNumber : arrNumbers) {
            if (arrNumber % 2 == 0) {
                sumEven = sumEven + arrNumber;
            } else {
                sumOdd = sumOdd + arrNumber;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

    private static int[] getNumbers(Scanner sc) {
        System.out.println("Please enter first number of interval: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter last number of interval: ");
        int lastNumber = sc.nextInt();

        System.out.println("Please enter count of numbers: ");
        int count = sc.nextInt();
        int[] arrNumbers = new int[count];
        for (int a = 0; a < count; a++) {
            arrNumbers[a] = (int) (Math.random() * (lastNumber - firstNumber + 1) + firstNumber);
        }
        System.out.println("Interval: " + Arrays.toString(arrNumbers));
        return arrNumbers;
    }
}
