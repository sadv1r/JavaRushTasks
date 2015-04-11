package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int max = number1 > number2 ? number1 > number3 ? number1 : number3 : number2 > number3 ? number2 : number3;
        int mid = max == number1 ? number2 > number3 ? number2 : number3 : max == number2 ? number1 > number3 ? number1 : number3 : number1 > number2 ? number1 : number2;
        int min = number1 < mid && number1 < max ? number1 : number2 < mid && number2 < max ? number2 : number3;
        System.out.println(max + " " + mid + " " + min);


    }
}
