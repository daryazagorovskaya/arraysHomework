package org.example;
// 1. Создайте массив целых чисел. Напишете программу, которая
//выводит сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                System.out.println
                        ("Number is  included in the array");
            else if (array[i] != number)
                System.out.println
                        ("Number is not included in the array");
// если честно уже закончились идеи, не могу понять почему криво работает, хотела сделать через return
            // но тогда не смогу сделать вывод текста на экран
        }
    }
}



