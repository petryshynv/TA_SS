package com.training.hw1;

public class Fibonacci {
    private int n;

    public Fibonacci() {
    }

    public int setN(int n) {
        this.n = n;
        return n;
    }

    public void printFibonacciNumbers(int n) {
        int f1 = 0, f2 = 1;
        int countEven = 0, countOdd = 0;
        int largestEven = Integer.MIN_VALUE;
        int largestOdd = Integer.MIN_VALUE;
        if (n < 1)
            return;
        System.out.print("Sequence HW1.Fibonacci: " + f1 + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            if (f2 % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (f2 % 2 == 0 && f2 > largestEven) {
                largestEven = f2;
            }
            if (f2 % 2 != 0 && f2 > largestOdd) {
                largestOdd = f2;
            }
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println();
        System.out.println("Largest even number of sequence HW1.Fibonacci: " + largestEven);
        System.out.println("Largest odd number of sequence HW1.Fibonacci: : " + largestOdd);
        System.out.println("Persentage even of sequence HW1.Fibonacci: : " + countEven * 100 / n + "%");
        System.out.println("Persentage odd of sequence HW1.Fibonacci: " + countOdd * 100 / n + "%");
    }
}
