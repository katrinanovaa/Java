package Home_1;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean function = true;
        while (function) {
            System.out.println(" ");
            System.out.println("Выберите задачу к просмотру: ");
            System.out.println("1 - 1 ДЗ. Треугольное число");
            System.out.println("2 - 2 ДЗ. Простые числа");
            System.out.println("0 - Всё посмотрел, хочу выйти");
            System.out.print("Я выбираю: ");
            int numberOfCase = scanner.nextInt();

            switch (numberOfCase) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    function = false;
                    break;
                default:   //работает только на числа, не на слова
                    System.out.println("Некорректная запись, повторите попытку ввода!");
                    break;
            }
        }
    }

    // Задача 1. Вычислить n-ое треугольное число(сумма от 1 до n),
    // n! (произведение чисел от 1 до n)
    static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Треугольное число = " + Triangle(number));
    }
    static int Triangle(int num){
        if (num == 1){
            return 1;
        }
        return Triangle(num-1) + num;
    }

    //Задача 2. Вывести все простые числа от 1 до 1000
    static void task2() {
        int finish_number = 1000;
        //поскольку даны конкретные числа, заведем их сразу в программу
        System.out.print("Простые числа: ");
        for (int i = 2; i <= finish_number; i++) {
            boolean agg = true;
            for (int j = 2; j <= i; j++) {
                int integer_number = i / j;
                int ostatok_number = i % j;
                if ((integer_number > 1) && (ostatok_number == 0)){
                    agg = false;
                }
                    else if ((integer_number == 1) && (ostatok_number == 0) && (agg == true)){
                    System.out.print(i+ ", ");
                    }
            }
        }
    }
}
