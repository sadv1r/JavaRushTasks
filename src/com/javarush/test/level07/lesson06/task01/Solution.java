package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("fda");
        arrayList.add("fdafds");
        arrayList.add("fdafdsfsd");
        arrayList.add("fdafdsfsdfdsg");
        arrayList.add("fdafdsfsdfdsggsg");
        System.out.println(arrayList.size());
        for (String a : arrayList)
            System.out.println(a);
    }
}
