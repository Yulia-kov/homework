package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HwSimpleTasks {
    public static void main(String[] args) {

        // Задача 1
        //В переменной n хранится натуральное трёхзначное число. Вывсети в консоль сумму цифр числа n.
        int n = 325;
        int y1 = n / 100;
        int s1 = n - y1 * 100;
        int y2 = s1 / 10;
        int y3 = s1 - y2 * 10;
        int rez = y1 + y2 + y3;
        System.out.println("Задача 1. Сумма всех цифр числа n = " + n + " равна " + rez);

//        Задача 2
//        Проверить является ли целое число записанное в переменную n, чётным либо нечётным. Результат вывсети в консоль.
        if (n % 2 == 0) {
            System.out.println("Задача 2. Число n = " + n + " является четным");
        } else {
            System.out.println("Задача 2. Число n = " + n + " является нечетным");
        }
//        Задача 3
//        Даны два целых числа n и m. Наименьшее из них сохранить в переменную res и вывести ее на экран.
        int m = 100;
        int res;
        if (n < m) {
            res = n;
        } else {
            res = m;
        }
        System.out.println("Задача 3. Наименьшее число = " + res);

//        Задача 4
//        Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [5;122] в интервал (25;100) и выводить результат в консоль.
//                Примеры работы программы:
//        Число 113 не содержится в интервале (25,100)
//        Число 72 содержится в интервале (25,100)

        int programNum = (int) (Math.random() * 118) + 5;
        if (programNum < 25 || programNum > 100) {
            System.out.println("Задача 4. Число " + programNum + " не содержится в интервале (25,100) ");
        } else {
            System.out.println("Задача 4. Число " + programNum + " содержится в интервале (25,100) ");
        }

//        Задача 5
//        Написать код, выводящий на экран случайно сгенерированное трёхзначное число и его наибольшую цифру.
//        Примеры работы программы:
//        В числе 208 наибольшая цифра 8
//        В числе 774 наибольшая цифра 7
//        В числе 613 наибольшая цифра 6
        int programNum2 = (int) (Math.random() * 900) + 100;
        y1 = programNum2 / 100;
        s1 = programNum2 - y1 * 100;
        y2 = s1 / 10;
        y3 = s1 - y2 * 10;
        if (y1 >= y2 && y1 >= y3) {
            rez = y1;
        } else if (y2 >= y1 && y2 >= y3) {
            rez = y2;
        } else {
            rez = y3;
        }
        System.out.println("Задача 5. В числе " + programNum2 + " наибольшая цифра " + rez);
        //        Задача 6
//        Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int g = 1000;
        System.out.println("Задача 6.");
        while (g < (10000 - 3)) {
            g = g + 3;
            System.out.print(g + " ");
        }
//        Задача 7
//        Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

        System.out.println("" +
                "");
        System.out.println("Задача 7.");
        g = 1;
        for (int i = 1; i < 56; i++) {
            System.out.print(g + " ");
            g = g + 2;
        }

//        Задача 8
//        Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        System.out.println("" +
                "");
        System.out.println("Задача 8.");
        g = 90;
        while (g >= 0) {
            System.out.print(g + " ");
            g = g - 5;
        }
//
//        Задача 9
//        Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        System.out.println("" +
                "");
        System.out.println("Задача 9.");
        g = 2;
        for (int i = 1; i < 20; i++) {
            System.out.print(g + " ");
            g = g * 2;
        }
//
//        Задача 10
//        Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
        Scanner in = new Scanner(System.in);
        System.out.println("" +
                "");
        System.out.println("Задача 10.");
        System.out.println("Введите число из диапазона [-33; +33]:");
        n = in.nextInt();
        m = n;
        int i = 1;
        if (n >= 0) {
            while (i != n) {
                m = m * i;
                i++;
            }
        } else {
            while (i != Math.abs(n)) {
                m = m * i;
                i++;
                System.out.println(m);
                System.out.println(i);
            }
        }

        System.out.println("Факторил числа " + n + " равен " + m);

//  немного другое решение
        System.out.println("Задача 10.v2.");
        m = 1;
        i = 1;
        if (n >= 0) {
            while (i <= n) {
                m = m * i;
                i++;
            }
        } else {
            while (i <= Math.abs(n)) {
                m = m * i;
                i++;
                System.out.println(m);
                System.out.println(i);
            }
        }

        System.out.println("Факторил числа " + n + " равен " + m);
//
//        Задача 11
//        Выведите на экран первые 11 членов последовательности Фибоначчи.
//

        int fNext;
        i = 2;
        int[] someArr;
        someArr = new int[11];
        someArr[0] = 0;
        someArr[1] = 1;
        while (i < 11) {
            someArr[i] = someArr[i - 1] + someArr[i - 2];
            i++;

        }
        System.out.println("Задача 11. Первые 11 членов последовательности Фибоначчи: ");
        System.out.println(Arrays.toString(someArr));

//                Задача 12
//        Электронные часы показывают время в формате от 00:00 до 23:59.
//        Подсчитать сколько раз за сутки случается так,
//        что слева от двоеточия показывается симметричная комбинация для той,
//        что справа от двоеточия (например, 02:20, 11:11 или 15:51).

        System.out.println("Задача 12.");

        int num12 = 0;
        int num34 = 0;

        i = 0;

        while (num12 != 24) {

            int num1 = num12 / 10;
            int num2 = num12 - (num1 * 10);

            num34 = 0;
            while (num34 != 59) {

                int num3 = num34 / 10;
                int num4 = num34 - (num3 * 10);

                num34 = num34 + 1;

                if ((num1 == num4) && (num2 == num3)) {
                    i++;
                    System.out.println(num1 + "" + num2 + ":" + num3 + "" + num4);
                }
            }
            num12 = num12 + 1;
        }
        System.out.println("Симметричная комбинация бывает " + i + " раз");


    }
}
