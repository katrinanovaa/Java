package ru.novikova.java.homework3;

import java.util.*;
/*Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение*/

public class Homework_3 {
    public static void main(String[] args) {
        List<Integer> list = genereteList();
        // Список с произвольными значениями
        System.out.print("Дан массив: ");
        System.out.println(list);
        // Список с удаленнными четными значений
        System.out.print("Массив с удаленными четными числами: ");
        System.out.println(deleteEven(list));

        // Минимальное значение
        System.out.print("Минимальное значение в массиве: ");
        System.out.println(Collections.min(list));

        // Максимальной значение
        System.out.print("Максимальное значение в массиве: ");
        System.out.println(Collections.max(list));

        // Среднее арифмитическое значение
        System.out.print("Среднеарифметическое значение в массиве: ");
        System.out.println(averageOfList(list));

    }

    public static List<Integer> genereteList() {
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            array.add(new Random().nextInt(100));
        }
        return array;

    }

    public static List<Integer> deleteEven(List<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.addAll(list);
        for(int i = newlist.size() - 1; i >= 0; i--) {
            if(newlist.get(i) % 2 == 0) {
                newlist.remove(i);
            }
        }
        return newlist;

    }

    public static double averageOfList(List<Integer> list) {
        int sum = 0;
        for(int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
        }
        return (double) sum / list.size();
    }

}