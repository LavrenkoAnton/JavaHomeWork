package com.pb.lavrenko.hw3;

import java.util.Scanner;
import java.util.Random;

    public class Bingo {
        public static void main(String[] args) {
            System.out.println("Вам нужно угадать число от 0 до 100. Вводите");
            System.out.println("Для выхода из программы введите - 666!");

            Random random = new Random();
            int UnknownNumber = random.nextInt(101); // загаданое число
            int UserNumber;          // число пользователя
            int TrysCount = 0;       // кол-во попыток
            Scanner input = new Scanner(System.in);

            do {
                TrysCount++;
                System.out.print("Попытка " + TrysCount + " :" );
                UserNumber = input.nextInt();

                if(UserNumber == 666) {
                    System.out.println("Игра окончена!");
                    break;
                }
                if (UserNumber > UnknownNumber)
                    System.out.println("Моё число меньше.");
                else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");
                else System.out.println("Вы угадали!");

            } while (UserNumber != UnknownNumber);

            System.out.println("Количество попыток: " + TrysCount);
        }

    }

