package ru.novikova.java.homework4;

import java.util.LinkedList;

import java.util.*;

public class Homework4 {
    public static LinkedList<Integer> list;
    public static void main(String[] args) {
        list = genereteList();
        // Список с произвольными значениями
        System.out.println(list);
        // перевернутый список
        System.out.println(reverseList(list));

        // очередь с помощью LinkedList
        NewQueue<Integer> queue = new NewQueue<>();

        // enqueue() — помещает элемент в конец очереди
        queue.enqueue(12);
        queue.enqueue(42);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(47);
        queue.enqueue(9);
        queue.enqueue(65);
        queue.enqueue(52);
        queue.enqueue(11);
        queue.enqueue(185);
        queue.enqueue(16);
        queue.enqueue(7);


        // dequeue() — возвращает первый элемент из очереди и удаляет его
        System.out.println("Список до\n" + queue.toString());
        System.out.println(queue.dequeue() + "-Первый элемент, удаляем его");
        System.out.println("Список после\n" + queue);


        // first() — возвращает первый элемент из очереди, не удаляя
        System.out.println("Список до\n" + queue);
        System.out.println(queue.first() + "-Первый элемент в очереди, не удаляем его");
        System.out.println("Список после\n" + queue);

    }

    public static LinkedList<Integer> genereteList() {
        LinkedList<Integer> array = new LinkedList<>();
        for(int i = 0; i < 15; i++) {
            array.add(new Random().nextInt(100));
        }
        return array;
    }

    public static List<Integer> reverseList(LinkedList<Integer> list) {
        List<Integer> array = list;
        Collections.reverse(array);
        return array;
    }

}