package com.training.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static Scanner sc = new Scanner(System.in);
    public  void startFibonacci() {
        System.out.println("\nEnter a count of HW1.Fibonacci numbers:  ");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciNumbers(fibonacci.setN(sc.nextInt()));
    }

    public  void sumEvenAndOddNumbers() {
        int[] arrNumbers = getNumbers(sc);
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

    private  int[] getNumbers(Scanner sc) {
        System.out.println("\nPlease enter first number of interval: ");
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
