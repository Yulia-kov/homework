package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class HwArrays {
    public static void main(String[] args) {
        //Задача 1
        //Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2).
        System.out.println("Задача 1.");

        int[] someArr;
        someArr = new int[10];
        for (int i = 1; i < someArr.length + 1; i++) {
            someArr[i - 1] = i * 2;
        }

        System.out.println(Arrays.toString(someArr));
        int[] someArr2;
        someArr2 = new int[10];
        for (int i = 1; i < someArr.length + 1; i++) {
            someArr2[i - 1] = someArr[someArr.length - i];
        }
        System.out.println(Arrays.toString(someArr2));

//Задача 2
//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Выведите массив в консоль.
//Подсчитайте сколько в массиве чётных элементов и выведете это количество в консоль.
        System.out.println("Задача 2.");

        int[] someArr3;
        someArr3 = new int[15];
        for (int i = 0; i < someArr3.length; i++) {
            someArr3[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(someArr3));
        int sumChet = 0;
        int sumNechet = 0;
        for (int i = 0; i < someArr3.length; i++) {
            if (someArr3[i] % 2 == 0) {
                sumChet = sumChet + 1;
            } else {
                sumNechet = sumNechet + 1;
            }
        }
        System.out.println("Количество четных элементов: " + sumChet + ", количество нечетных: " + sumNechet);

        //Задача 3
        //Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его в консоль.
        //Определить и вывести в консоль сообщение о том, является ли массив строго возрастающей последовательностью.
        System.out.println("Задача 3.");

        int[] someArr4;
        int n = 0;
        someArr4 = new int[4];
        for (int i = 0; i < someArr4.length; i++) {
            someArr4[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(someArr4));
        for (int i = 0; i < someArr4.length - 1; i++) {
            if (someArr4[i] < someArr4[i + 1]) {
                n = n + 1;
            }
        }
        if (n == someArr4.length - 1) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }

        // Задача 4
        //Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        //Определите какой элемент встречается в массиве чаще всего и выведите об этом в консоль.
        //Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        System.out.println("Задача 4.");

        int[] someArr5;
        someArr5 = new int[11];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < someArr5.length; i++) {
            someArr5[i] = (int) (Math.random() * 3) - 1;
        }
        System.out.println(Arrays.toString(someArr5));

        for (int i = 0; i < someArr5.length; i++) {
            if (someArr5[i] == -1) {
                sum1 = sum1 + 1;
            } else if (someArr5[i] == 0) {
                sum2 = sum2 + 1;
            } else if (someArr5[i] == 1) {
                sum3 = sum3 + 1;
            }
        }
        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println("Чаще всего встречается элемент -1: " + sum1 + " раз");
        } else if (sum2 > sum1 && sum2 > sum1) {
            System.out.println("Чаще всего встречается элемент 0: " + sum2 + " раз");
        } else if (sum3 > sum1 && sum3 > sum1) {
            System.out.println("Чаще всего встречается элемент 1: " + sum3 + " раз");
        }


        // Задача 1
        //Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
        // Вывести массив в консоль.

        System.out.println("Задача 1.");

        int[][] someArr6;
        someArr6 = new int[8][5];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                someArr6[i][j] = (int) (Math.random() * 101) - 1;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(someArr6[i][j] + "\t");
            }
            System.out.println();
        }

        //Задача 2
        //Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
        // Вывести массив в консоль.
        //Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
        //Если таких строк несколько, то вывести индекс первой встретившейся из них.

        System.out.println("Задача 2.");

        int[][] someArr7;
        someArr7 = new int[7][4];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                someArr7[i][j] = (int) (Math.random() * 11) - 5;
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(someArr7[i][j] + "\t");
            }
            System.out.println();
        }
        int prod = 1;
        int max = -1;
        int maxI = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                prod = Math.abs(prod * someArr7[i][j]);
            }
            if (prod > max) {
                max = prod;
                maxI = i;
            }
            prod = 1;
        }
        System.out.println("Индекс строки с наибольшим по модулю произведением элементов: " + maxI);

        //Задача 3
        //Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        // Вывести массив в консоль.
        //Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
        //При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
        //Порядок остальных элементов строки не имеет значения (т.е. можно соврешить только одну перестановку,
        // а можно отсортировать по убыванию каждую строку).
        //Вывести преобразованный массив в консоль.
        //
        //.
        System.out.println("Задача 3.");
        System.out.println("Первичный массив:");

        int[][] someArr8;
        someArr8 = new int[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                someArr8[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(someArr8[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Преобразованный массив:");
        max = -1;
        int zamena = 0;
        for (int i = 0; i < 6; i++) {
            max = -1;
            for (int j = 0; j < 7; j++) {
                zamena = someArr8[i][0];
                if (someArr8[i][j] > max) {
                    max = someArr8[i][j];
                    someArr8[i][0] = someArr8[i][j];
                    someArr8[i][j] = zamena;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(someArr8[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
