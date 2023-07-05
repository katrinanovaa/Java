package ru.novikova.java.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите
// в лог-файл.

public class SecondTask {
    public static void main(String[] args)  {
        try {
            File notLogFile = new File("C:\\GB\\Java\\Homework\\src\\main\\java\\ru\\novikova\\java\\homework2\\notLog.txt");
            FileWriter fileWriter = new FileWriter(notLogFile, true);
            // true прописыается когды мы хотим дополнять файл, а не заново его переписывать
            int[] massive = new int[6];
            System.out.println("Дан рандомный массив: ");
            for (int i = 0; i < massive.length; i++) {
                massive[i] = (int) (Math.random() * 100);
                System.out.print(massive[i] + " ");
            }
            System.out.println("\n ");
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < massive.length - 1; i++) {
                    if (massive[i] > massive[i + 1]) {
                        temp = massive[i];
                        massive[i] = massive[i + 1];
                        massive[i + 1] = temp;
                        sorted = false;
                    }
                }
                System.out.println(Arrays.toString(massive));
                fileWriter.write(Arrays.toString(massive));
                fileWriter.append("\n");
                fileWriter.flush();
            }
            System.out.print("Конечный результат: ");
            System.out.println(Arrays.toString(massive));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}