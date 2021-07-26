package com.training;

import com.training.hw1.Task1;
import com.training.hw2.Task2;

public class Main {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.consoleMenu();
        System.out.println("*********************************************");
        Task1 task1 = new Task1();
        task1.sumEvenAndOddNumbers();
        task1.startFibonacci();
    }
}
