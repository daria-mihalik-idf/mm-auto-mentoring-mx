package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
         for (int i = 1; i<=5; i++) {
             result = s + result;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i<count; i++){
 result = result+s;
}
        return result;
    }

    public static void main(String[] args) {
        System.out.print(multiply("Амиго", 5));

    }
}
