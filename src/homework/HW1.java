package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        //1) Найти наибольший общий делитель (НОД) двух чисел
        System.out.println("Задача 1.");
        int a = 535;
        int b = 17;
        System.out.println("Исходные числа: " + a + " и " + b);

        if (a < b) {
            int zamena = a;
            a = b;
            b = zamena;
        }
        if (a % b == 0) {
            System.out.println("НОД равен: " + b);
        }
        int zamena2;
        while (a % b != 0) {
            zamena2 = a;
            a = b;
            b = zamena2 % b;
        }
        System.out.println("НОД равен: " + b);


        //2)Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
        // Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
        // Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Постарайтесь решить задачу наиболее оптимальным способом
        System.out.println("Задача 2.");
        int[] someArr = {1, 3, -5, 2, 0, 17, -10, 9, 2, 3, 5};
        int j;
        int n = 0; // счетчик

        for (int i = 0; i < someArr.length; i++) {
            j = i;
            while (j < (someArr.length - 1)) {

                int sum = someArr[i] + someArr[j + 1];

                if (sum == 7) {
                    System.out.println(someArr[i] + " + " + someArr[j + 1] + " " + " = " + sum);
                    n = n + 1;
                }

                j = j + 1;
            }
        }
        if (n == 0) {
            System.out.println("Нет цифр, дающих в сумме 7");
        }


        //3)Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
        System.out.println("Задача 3.");
        int[] someArr2;
        n = (int) (Math.random() * 24) + 3;
        someArr2 = new int[n];

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] = (int) (Math.random() * 2000) - 1000;
        }

        System.out.println(Arrays.toString(someArr2));
        Arrays.sort(someArr2);
        System.out.println(Arrays.toString(someArr2));
        System.out.println("Максимальное значение = " + someArr2[someArr2.length - 1] +
                ", минимальное значение = " + someArr2[0] +
                ", среднее значение = " + someArr2[n / 2]);


        //4)Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        // Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        // Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль

        System.out.println("Задача 4.");
        n = 0;
        int g = 0;
        Scanner in = new Scanner(System.in);

        while (n <= 3) {
            System.out.println("Введите число из больше 3:");
            n = in.nextInt();
        }

        int[] someArr3;
        someArr3 = new int[n];
        for (int i = 0; i < someArr3.length; i++) {
            someArr3[i] = (int) (Math.random() * n + 1);
            if (someArr3[i] % 2 == 0) {
                g = g + 1;
            }
        }

        int[] someArr4;
        j = 0;
        someArr4 = new int[g];
        for (int i = 0; i < someArr3.length; i++) {
            if (someArr3[i] % 2 == 0) {
                someArr4[j] = someArr3[i];
                j = j + 1;
            }
        }
        System.out.println("Случайный массив:");
        System.out.println(Arrays.toString(someArr3));
        if (j == 0) {
            System.out.println("Четный элементов в случайном массиве не обнаружено");
        } else {
            System.out.println("Массив четных значений:");
            System.out.println(Arrays.toString(someArr4));
        }

        //5)Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        // Вывести массив в консоль. После на отдельной строке вывести в консоль значение максимального элемента этого массива.


        System.out.println("Задача 5.");

        int[][] someArr5;
        someArr5 = new int[5][8];

        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                someArr5[i][j] = (int) (Math.random() * 101) - 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(someArr5[i][j] + "\t");
            }
            System.out.println();
        }

        int max = -100;
        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                if (someArr5[i][j] > max) {
                    max = someArr5[i][j];
                }
            }
        }
        System.out.println("Значение максимального элемента массива = " + max);
    }
}
