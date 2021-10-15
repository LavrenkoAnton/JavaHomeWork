package com.pb.lavrenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        int result = 0;
        char operation;
        System.out.println("Ввидите число 1:");
        operand1 = scan.nextInt();
        System.out.println("Ввидите операцию:");
        operation = scan.next().charAt(0);
        System.out.println("Ввидите число 2:");
        operand2 = scan.nextInt();

        switch (operation) {
            case '+': result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '/':if (operand2 == 0) {
                System.out.println("делить на 0 запрещено");
            } else {
                result = operand1 / operand2;
            }
                break;
            default:  System.out.println("Упс! Что-то пошло не так");
                return;
        }
        System.out.println("Итог" + result);
    }
}