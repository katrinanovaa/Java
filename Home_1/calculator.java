import java.util.Scanner;

public class calculator {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Реализовать простой калькулятор
        Scanner scanner = new Scanner(System.in);
        //здесь будет меню
        System.out.println("Добро пожаловать в калькулятор. Выбери действие: ");
        boolean function = true;
        while (function) {
            System.out.println("1 - Выполним простые операции");
            System.out.println("2 - Выполним сложные операции операции");
            System.out.println("0 - Выход");
            System.out.print("Какую операцию совершим?:");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    //vvodNumber();
                    operation();
                    break;
                case 2:
                    difficultOperation();
                    break;
                case 0:
                    function = false;
                    System.out.println("До встречи!");
                    break;
                
            }
        }
    }

    static void operation(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("введите первое число: ");
            double a1 = scanner.nextDouble();
            System.out.print("введите второе число: ");
            double b2 = scanner.nextDouble();
            double answer;
            System.out.println();
            System.out.println("Какую операцию произведем? Выбери из следующего: ");
            System.out.println("1 - сложение");
            System.out.println("2 - вычитание");
            System.out.println("3 - умножение");
            System.out.println("4 - деление");
//        char numberOfOperation = (char) System.in.read();
//        int numberOfOperation = Integer.parseInt(scanner.nextLine());
            int numberOfOperation = scanner.nextInt();

            switch (numberOfOperation) {
                case 1:
                    answer = a1 + b2;
                    System.out.println("Ответ: " + answer);
                    break;
                case 2:
                    answer = a1 - b2;
                    System.out.println("Ответ: " + answer);
                    break;
                case 3:
                    answer = a1 * b2;
                    System.out.println("Ответ: " + answer);
                    break;
                case 4:
                    if (b2 == 0) {
                        System.out.println("На ноль дельть нельзя!");
                    } else {
                        answer = a1 / b2;
                        System.out.println("Ответ: " + answer);
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод! Поробуй ещё раз");
                    break;
            }
    }

    static void difficultOperation(){
        Scanner scanner = new Scanner(System.in);
        boolean functionOfDifficultOperation = true;
        while (functionOfDifficultOperation) {

            System.out.println("Какую сложную операцию произведем? Выбери из слудующего: ");
            System.out.println("1 - Узнать квадрат числа");
            System.out.println("2 - Узнать корень числа");
            System.out.println("3 - Узнать процент от числа");
            System.out.println("0 - Не хочу решать, выхожу");
            int numberOfDifficultOperation = scanner.nextInt();

            switch (numberOfDifficultOperation) {

                case 1:
                    System.out.print("Узнать квадрат данного числа: ");
                    double v1 = scanner.nextDouble();
                    double answer = v1 * v1;
                    System.out.println("Ответ: " + answer);
                    break;

                case 2:
                    System.out.print("Узнать корень данного числа: ");
                    double v2 = scanner.nextDouble();
                    double answer2 = Math.sqrt(v2);
                    System.out.println("Ответ: " + answer2);
                    break;
                case 3:
                    System.out.print("Узнать процент: ");
                    double v3 = scanner.nextDouble();
                    System.out.print("от данного числа: ");
                    double v4 = scanner.nextDouble();
                    double answer3 = v4 * v3 / 100;
                    System.out.println("Ответ: " + answer3);
                    break;
                case 0:
                    functionOfDifficultOperation = false;
                    break;
                default:
                    System.out.println("Некорректный ввод! Попробуй еще раз");

            }
        }
    }
}

