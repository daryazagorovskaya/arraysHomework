package org.example;
// Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
//отдельных строках. Посчитайте среднее арифметическое элементов каждого
//массива и сообщите, для какого из массивов это значение оказалось больше
//(либо сообщите, что их средние арифметические равны).

import java.util.Arrays;

public class Task4 {
    public static void main(String args[]) {
        int[] array =  {1,3,5,7,9};
        int[] array2 = {2,4,6,8,0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }double average = sum/ array.length;
            System.out.println(average);
        for (int j = 0; j < array2.length; j++) {
            sum += array2[j];
        }double average2 = sum / array2.length;
            System.out.println(average2);
        if (average > average2) {
            System.out.println("average > average2");
        } else if (average < average2) {
            System.out.println("average < average2");
        } else {
            System.out.println("average = average2");
        }



    }
}