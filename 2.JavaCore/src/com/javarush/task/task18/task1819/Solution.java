package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fis1 = new FileInputStream(file1);
        byte[] bf1 = new byte[fis1.available()];
        fis1.read(bf1);
        fis1.close();

        FileOutputStream fos1 = new FileOutputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] bf2 = new byte[fis2.available()];
        fis2.read(bf2);
        fis2.close();

        fos1.write(bf2);
        fos1.write(bf1);

        fos1.close();
    }
}