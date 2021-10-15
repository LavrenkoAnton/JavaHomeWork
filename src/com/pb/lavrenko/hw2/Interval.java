package com.pb.lavrenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int number;
            System.out.println("Введите значения целого числа");
            number = scan.nextInt();
            if (number >= 0 && number <= 14)
            {
                System.out.println("Число " + number + " в интервале от 0 до 14");
            }
            else if (number >= 15 && number <= 35)
            {
                System.out.println("Число " + number + " в интервале от 15 до 35");
            }
            else if (number >= 36 && number <= 50)
            {
                System.out.println("Число " + number + " в интервале от 36 до 50");
            }
            else if (number >= 51 && number <= 100)
            {
                System.out.println("Число " + number + " в интервале от 51 до 100");
            }
            else
            {
                System.out.println("Число " + number + " вне допустимого интервала");
            }
        } catch(Exception e)
        {
            System.out.println("Недопустимое значение при вводе целого числа");
        }
    }
}