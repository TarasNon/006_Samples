package com.itvdn.javaStarter;

import java.util.Scanner;

public class C03_WhileContinue {
    // Циклическая конструкция - while. (с пропуском итерации - continue)

    public static void main(String[] args) {
        int counter = 0;
        String login = "admin";
        String password = "123123";
        Scanner input = new Scanner(System.in);

        while (counter < 5) {
            counter++;
            System.out.println("Введите логин у Вас 4 попытки");
            String in = input.next();
            if (!in.equals(login)) { continue;}

       while (counter < 5) {
           counter++;
           System.out.println("Введите пароль");
           String pass = input.next();
           if (pass.equals(password)) {
               break;
           }
           }
            System.out.println("Правильно вы вошли в систему");
            break;
       }
    }
}