package ru.iteco;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Задание исходной строки");
        String input1 = src.nextLine();

        System.out.println("Введенная строка: " + input1);
        String[] word;
        word=input1.split(" ");
 int summ=10;
        System.out.println( "Строка1: " + word[0]);
        System.out.println( "Строка2: " + word[1]);
        String name=word[0];
        String result="";

 int digit1=Integer.parseInt(word[1]);
 summ =summa(digit1);
        switch (summ) {
            case 1: result="одному";
                    break;
            case 2:  result="двум";
                break;
            case 3:  result="трем";
                break;
            case 4: result="четырем";
                break;
            case 5: result="пяти";
                break;
            case 6:  result="шести";
                break;
            case 7:  result="семи";
                break;
            case 8:  result="восьми";
                break;
            case 9: result="девяти";
                break;
            case 10:  result="десяти";
                break;
            default:  result="нулю";

        }

        System.out.printf("Здравствуй, %s! Сумма цифр в числе равна %s", name, result);
        src.close();
    }

    private static int summa(int num) {
        int summ=0;
        while (num!=0){
            summ+=num% 10;
            num/=10;
        }
        return summ;
    }

}
