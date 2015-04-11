package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {
    private static final int NUMBERS = 5;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[NUMBERS];

        for (int i = 0; i < NUMBERS; i++)
            array[i] = Integer.parseInt(reader.readLine());

        for (int j = 0; j < NUMBERS; j++) {
            for (int i = NUMBERS - 1; i > 0; i--)
                if (array[i] < array[i - 1])
                    swap(array, i);
            System.out.println(array[j]);
        }

    }

    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i-1];
        array[i-1] = temp;
    }

}
