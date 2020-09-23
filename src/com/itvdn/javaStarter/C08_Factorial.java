package com.itvdn.javaStarter;

import java.util.Scanner;
import java.lang.String;
public class C08_Factorial {

    public static void main(String[] args) {
        int counter = 4;
        Scanner factorial = new Scanner(System.in);

        System.out.println("Введите факториал");
        int fact = factorial.nextInt();



        do {
            fact *= counter-- ;
        }
        while (counter > 0);

        System.out.println(fact);



        }
    }

