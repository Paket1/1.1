package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 3 (Чтобы не делать кучу файлов, я сделаю первую практику все в одном.
        // Просто разкомментите ненужные задания при проверке)
        /*

        int[] testArray;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = s.nextInt();
        testArray = new int[n];
        System.out.println("Введите целые числа в массив");
        for (int i = 0; i < n; i++) {
            testArray[i] = s.nextInt();
        }
        for (int i : testArray) {

            sum += i;
        }
        System.out.println("Сумма с помощью for-each = " + sum);
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += testArray[i];
        }
        System.out.println("Сумма с помощью for = " + sum);

        sum = 0;
        int i = 0;
        while (i < n) {
            sum += testArray[i];
            i++;
        }
        System.out.println("Сумма с помощью while = " + sum);

        sum = 0;
        i = 0;
        do {
            sum += testArray[i];
            i++;
        } while (i < n );
        System.out.println("Сумма с помощью do-while = " + sum);

         */



        //Задание 4 (Предполагается, что аргументами строки будут числа типа инт)
        /*


        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = s.nextLine();
        String[] strMas= str.split("[ ]");//разбиваем строку на масссив подстрок
        int[] chisla = new int[strMas.length];//создаем массив в который будут внесены числа
        for (int i = 0; i < strMas.length; i++) chisla[i] = Integer.parseInt(strMas[i]); //преобразовываем числа в инт

        for (int i = 0; i < chisla.length; i++) System.out.println(chisla[i]);


         */

        //Задание5
        for (int i = 1; i < 11; i++) {
            System.out.printf("Число гармонического ряда номер %s = %s,\n", i, 1./i);
        }
     }

}