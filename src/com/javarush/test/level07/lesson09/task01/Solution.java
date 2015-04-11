package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> devideBy3 = new ArrayList<>();
        ArrayList<Integer> devideBy2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));

        for (int i = 0; i < 20; i++) {
            if (arrayList.get(i)%3 == 0)
                devideBy3.add(arrayList.get(i));
            if (arrayList.get(i)%2 == 0)
                devideBy2.add(arrayList.get(i));
            if (arrayList.get(i)%3 != 0 && arrayList.get(i)%2 != 0)
                other.add(arrayList.get(i));
        }

        printList(devideBy3);
        printList(devideBy2);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        for (int a : list)
            System.out.println(a);
    }
}
