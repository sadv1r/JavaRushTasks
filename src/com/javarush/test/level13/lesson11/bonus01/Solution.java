package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new File(bufferedReader.readLine()));
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a % 2 == 0)
                arrayList.add(a);
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arrayList.get(j) > arrayList.get(j+1)){
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j+1, temp);
                }
            }
        }
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}
