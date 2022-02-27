package ru.iteco;

public class HomeWork2_1 {


    public static void main(String[] args) {
        int[] massive= {3,22,1,13,4,6,16,5};
        int max=0;
        int summ=0;
       System.out.println("Задание 1. Вывод четных чисел");
        for (int i=0; i<massive.length;i++) {
            if (massive[i] % 2==0)
                 System.out.print((massive[i]+","));
            if (massive[i]>=max) {
                max=massive[i];}
            summ+=massive[i];
        }
        System.out.println("\n"+"Задание 2. Вывод двухзначных чисел");
        for (int i=0; i<massive.length;i++) {
           if (massive[i] >= 10 && massive[i] <= 99)
                System.out.print(massive[i] +",");
        }
        System.out.println("\n"+"Задание 3. Максимальное число массива:"+ max);
        System.out.println("Задание 4. Сумма массива равна:"+ summ);

        int i=massive.length-1;

        System.out.println("Задание 5. Вывести массив в обратном порядке");
        for (; i>=0;i--) {
            System.out.print(massive[i]+",");
        }
    }
}
