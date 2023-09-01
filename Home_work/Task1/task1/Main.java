package Task1.task1;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // task1();
        // task2();
        // task3();
        task4();

    }

    static void task1() {
        Float number;
        while (true) {
            System.out.println("Введите дробное число, с плавующей ЗАПЯТОЙ: ");
            try {
                number = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не дробное число, повторите попытку!");
                scanner.next();
            }
        }
        System.out.println("Значение дробного числа: " + number);
    }

    static void task2() {
        // Менять ничего не пришлось, просто дописать массив, чтобы была возможность
        // запстить проверку
        int[] intArray = { 1, 4, 5, 6, 3, 5, 7, 3, 4 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    static void task3() {
        // Убираем 2 последних catch так как они унаследованны от первого, так же не вижу смысла делать проброс в main, так как мы находимся в корне программы, выше класса нет. Так же не вижу смысла пробрасывать FileNotFoundException в методе printSum. Надеюсь я все правильно понял

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        // catch (NullPointerException ex) {
        //     System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        //     System.out.println("Массив выходит за пределы своего размера!");
        // }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    static void task4() {
        System.out.println("Напишите что нибудь: ");

        String str = scanner.nextLine();
        if(str.isEmpty()){
            throw new NullPointerException("Пустая строка недопустима, заполните ее!");
        } else {
            System.out.println("Ваша строка: " + str);
        }
    }
}
