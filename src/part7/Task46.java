package part7;

import java.util.Scanner;

public class Task46 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            a = getNumberFromConsole("Введите первое число");
            b = getNumberFromConsole("Введите второе число");
        } catch (NumberFormatException e) {
            // сохранить текст ошибки в лог
            e.printStackTrace();
            System.out.println("Одно или оба значения некорректны!");
        }

        System.out.println("Результат: " + (a + b));
    }

    public static int getNumberFromConsole(String message) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message + ": ");
        String s = scanner.nextLine();

        return Integer.parseInt(s);
    }
}
