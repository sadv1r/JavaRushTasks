package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //Напишите тут ваш код
        ArrayList[] arrayOfStringList = new ArrayList[3];


        for (int i = 0; i < 3; i++) {
            arrayOfStringList[i] = new ArrayList<String>();
            arrayOfStringList[i].add("lalka");
            arrayOfStringList[i].add("lalka2");
            arrayOfStringList[i].add("lalka3");
        }

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}