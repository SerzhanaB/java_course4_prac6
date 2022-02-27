package ru.iteco;

import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int[][] massive= new int[4][3];
        int ColumnAmount=0; // без сохранения переменной не получалось посчитать сумму в столбцах
        System.out.println("Задание 0. Ввод массива");
        for (int i=0; i<massive.length; i++ ){
            for (int j=0; j<massive[i].length; j++ ){
                ColumnAmount=massive[i].length;
                massive[i][j]=src.nextInt();

             }
        }
        System.out.println("Задание 0. Печать массива");
        for (int i=0; i<massive.length; i++ ){
            for (int j=0; j<massive[i].length; j++ ){
                System.out.print(massive[i][j]);
            }
            System.out.print("\n");
        }
        // Вывод суммы по строкам
        int summLine=0;
        System.out.println("\n"+"Задание 1. Печать суммы по строкам");
        for (int i=0; i<massive.length; i++ ){
            for (int j=0; j<massive[i].length; j++ ){
              summLine+=massive[i][j];
            }
            System.out.println("Сумма по строке " +(i+1)+" равна:"+summLine);
            summLine=0;
        }

// Вывод суммы по столбцам

        int summColumn=0;
        System.out.println("Задание 2. Печать суммы по столбцам");
        for (int j=0; j<ColumnAmount; j++ ){
            for (int i=0; i<massive.length; i++ ){
                summColumn+=massive[i][j];
                //System.out.print(massive[i][j]);
            }
            System.out.println("Сумма по столбцу " +(j+1)+" равна:"+summColumn);
            summColumn=0;
        }

        // Вывод среднего арифметическое строкам

        summLine=0;
        System.out.println("Задание 4. Среднее арифметическое");
        System.out.println("Количество столбцов: " +ColumnAmount);
        for (int i=0; i<massive.length; i++ ){
            for (int j=0; j<massive[i].length; j++ ){
                summLine+=massive[i][j];
                System.out.print(massive[i][j]+",");
            }
            System.out.println("Сумма " +(i+1)+" строки равна:"+summLine);
            System.out.println("Среднее арифметическое по строке " +(i+1)+" равно:"+summLine/ColumnAmount);
            summLine=0;
        }

        // Вывод одномерного массива перевернутого

        System.out.println("Задание 5. Перевернутый массив в одномерный");
        int size= massive.length*ColumnAmount;
        int[] massive2= new int[size];
        System.out.println("Размер нового масссива "+size);
        int m=0;

        for (int i = (massive.length - 1); i >= 0; i--) {
                for (int j = (massive[i].length - 1); j >= 0; j--) {
                     massive2[m] = massive[i][j];
                    System.out.println(massive2[m]+ ",");
                    m++;
                }
        }


        // Замена нечетных на 1, а четных на 0


        System.out.println("\n"+"Задание 3. Замена нечетных на 1, а четных на 0");

        for (int i=0; i<massive.length; i++ ){
            for (int j=0; j<massive[i].length; j++ ){
             if    (massive[i][j] % 2==0) {  massive[i][j]=0;}
             else { massive[i][j]=1;}
                System.out.print(massive[i][j]+";");
            }
          System.out.print("\n");
        }
        src.close();
    }

}
