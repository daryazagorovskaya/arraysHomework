package org.example;
// Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива. Пусть число задается с консоли (класс Scanner).
//Если такого числа нет - выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for delete ");
        int number = scanner.nextInt();
        boolean contains = Arrays.stream(array).anyMatch(numb -> numb == number);
        if (contains) {
            int[] newArray = Arrays.stream(array).filter(numb -> numb != number).toArray();
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println("Your number is not in the array");
        }
        //решение получено с помощью общего чата
    }
}

//        int [] newArray;
//        int size = array.length;
//        for (int elem: array) {
//            if (elem == number) {
//                size -= 1;
//            }
//        }
//        if (size == array.length){
//            System.out.println("The entered number is not in the array");
//        } else {
//            newArray = new int[size];
//            for (int i = 0; i < array.length; i++){
//                if (array[i] != number ){
//                    for (int j = 0; j < array.length; j++){
//                        if (newArray[j] == array[i]);
//
//                    }
//                }
//            }
//        }
