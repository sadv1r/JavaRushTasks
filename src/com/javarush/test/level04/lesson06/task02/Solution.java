package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());
        int max = number1 > number2 ?
                        number1 > number3 ?
                            number1 > number4 ?
                                number1 : number4 :
                            number3 > number4 ?
                                number3 : number4 :
                        number2 > number3 ?
                            number2 > number4 ?
                                number2 : number4 :
                            number3 > number4 ?
                                number3 : number4;
        System.out.println(max);
    }
}
