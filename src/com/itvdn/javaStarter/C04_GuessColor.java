package com.itvdn.javaStarter;

import java.nio.Buffer;
import java.util.Scanner;

public class C04_GuessColor {
    // Циклическая конструкция - while.

    public static void main(String[] args) {
        System.out.println("Угадайте задуманный цвет с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX = 5;
        int attempt = 0;

        String color = "red";
        Scanner in = new Scanner(System.in);



        while (attempt < MAX) {
            attempt++;
            System.out.println("Введите цвет");
            String inn = in.next();


            if (inn.equals("exit")) {
                break;
            }
            if (!inn.equals(color)) {
              continue;
            }

                System.out.println("GOOD!");
             break;
            }

            System.out.print(" Да с " + attempt + " попытки");


        }

    }















