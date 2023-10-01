package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение. Для генерации случайного
//числа используйте метод Math.random(). Пусть будет возможность создавать
//массив произвольного размера. Пусть размер массива вводится с консоли.

// ( Math.random() * (b-a) ) + a
public class Task3 {
    public  static void main (String args []) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++ ){
        array[i] = (int) (Math.random()*200 - 100); // [ -100; +100)
        }
        double max = array[0]; // Массив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++ ) {
            if (max > array[i])
                max = array[i];
            if (min < array[i])
                min = array[i];
            avg = array[i] / array.length;
        }
            System.out.println(Arrays.toString(array));
            System.out.println("Max " + max);
            System.out.println("Min " + min);
            System.out.println("Avg " + avg);









    }
}


