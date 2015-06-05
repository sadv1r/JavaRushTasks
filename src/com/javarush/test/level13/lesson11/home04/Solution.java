package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(bufferedReader.readLine());
        String line;
        while (!(line = bufferedReader.readLine()).equals("exit")) {
            outputStream.write((line + '\n').getBytes());
        }
        outputStream.write(("exit" + '\n').getBytes());
        bufferedReader.close();
        outputStream.close();
    }
}
