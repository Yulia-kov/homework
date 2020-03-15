package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class HwStrings {
    public static void main(String[] args) {

        //1.Даны 2 слова, состоящие из четного числа букв.
        // Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        System.out.println("Задача 1.");
        String str1 = "time";
        String str2 = "love";
        str1 = str1.substring(0, str1.length() / 2);
        str2 = str2.substring(str2.length() / 2);
        str1 = str1 + str2;
        System.out.println(str1);

        //2.Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        System.out.println("Задача 2.");
        int max = -1;
        int maxI = -1;

        String str3 = "She likes wonderful bananas";
        String[] strings = str3.split("\\s");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                maxI = i;
            }
        }
        System.out.println("Самым длинным словом в предложении: //" + str3 + "// является слово: " + strings[maxI] + ", " + max + " символов.");

        //3.Имеются две строки. Найти количество вхождений одной строки в другую.

        System.out.println("Задача 3.");
        int index = -2;
        int n = 0;
        String str4 = "ra";
        String str5 = "rara mra fraf uo jo ral YYYYYYYraYYYYY uuiuiuuiuiiuiuiuiu";
        String str6 = str5;
        while (str6.length() > 1) {
            index = str6.indexOf(str4);

            if (index != -1) {
                n = n + 1;
                str6 = str6.substring(index + str4.length(), str6.length());
            } else {
                break;
            }
        }

        if (n == 0) {
            System.out.println("Строка 1: //" + str4 + "// не входит в строку 2: //" + str5 + "//");
        } else {
            System.out.println("Строка 1: //" + str4 + "// входит в строку 2: //" + str5 + "// " + n + " раз.");
        }


        //4.Написать функцию, которая проверяет, является ли строка палиндромом.
        // Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.

        System.out.println("Задача 4.");

        String str7 = "торот";
        String str8, str9;
        int d;
        n = 0;
        if (str7.length() % 2 == 0) {
            d = str7.length() / 2;
        } else {
            d = str7.length() / 2 + 1;
        }

        for (int i = 0; i < d; i++) {
            str8 = str7.substring(i, i + 1);
            str9 = str7.substring(str7.length() - 1 - i, str7.length() - i);
            if (str8.contains(str9)) {
                n = n + 1;
            }
        }


        if (n == d) {
            System.out.println("Слово //" + str7 + "// является палиндромом");
        } else {
            System.out.println("Слово //" + str7 + "// не является палиндромом");

        }

// или же вариант с фразой

        str7 = "дом работа работа дом";
        String[] strings1 = str7.split("\\s");
        if (strings1.length % 2 == 0) {
            d = strings1.length / 2;
        } else {
            d = strings1.length / 2 + 1;
        }
        n = 0;
        for (int i = 0; i < d; i++) {
            str8 = strings1[i];
            str9 = strings1[strings1.length - i - 1];
            if (str8.contains(str9)) {
                n = n + 1;
            }
        }

        if (n == d) {
            System.out.println("Фраза //" + str7 + "// является палиндромом");
        } else {
            System.out.println("Фраза //" + str7 + "// не является палиндромом");

        }


        //5.Даны два слова и словарь (массив слов). Необходимо найти алгоритм превращения в другое,
        // меняя за один шаг одну букву, причем каждое новое слово должно быть в словаре (массиве слов).
        // Например,даны слова "hit" и "cog" и словарь(массив слов) ["hot", "dot", "dog", "log", "lot"].
        // Один из вариантов цепочки: "hit"->"hot"->"dot"->"dog"->"cog".

        System.out.println("Задача 5.");
        //над ней еще надо подумать, но она работает
        String str10 = "hit";
        String str11 = "cog";
        String str12 = "hot dot dog log lot";
        String alp = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] strings2 = alp.split("\\s");
        String str100;

        String s101, s102, s103, s111, s112, s113;

        s111 = str11.substring(0, 1);
        s112 = str11.substring(1, 2);
        s113 = str11.substring(2, 3);



        do {


            for (int j = 0; j < str10.length(); j++) {

                for (int i = 0; i < strings2.length; i++) {
                    str100 = str10.replace(str10.substring(j, j + 1), strings2[i]);
                    if (str12.contains(str100)) {
                        str10 = str100;
                        break;
                    }
                }
            }

            s101 = str10.substring(0, 1);
            s102 = str10.substring(1, 2);
            s103 = str10.substring(2, 3);

        } while ( !s102.contains(s112) || !s103.contains(s113) );

        if (!s111.contains(s101)) {
            str10 = str10.replace(str10.substring(0, 1), str11.substring(0, 1));
        } else if (!s112.contains(s102)) {
            str10 = str10.replace(str10.substring(1,2), str11.substring(1, 2));
        }else if (!s113.contains(s103)) {
            str10 = str10.replace(str10.substring(2, 3), str11.substring(2, 3));
        }
        System.out.println(str10);

        //6.Пользователь вводит названия городов через пробел. Вы их присваиваете переменной.
        // Переставьте названия так, чтобы они были упорядочены по алфавиту.

        System.out.println("Задача 6.");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите названия городов через пробел:");
        String str13 = in.nextLine();
        String[] strings3 = str13.split("\\s");
        Arrays.sort(strings3);
        System.out.println(Arrays.toString(strings3));


    }
}
