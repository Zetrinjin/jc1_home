package part2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("input number: ");

        num = scan.nextInt();

        if (checkNumber(num) == true) {

            System.out.println("last number is 7");

        } else {
            System.out.println("last number is not 7");
        }
    }

    static boolean checkNumber(int num) {
        int x = num;
        boolean check;

        if (x > 10) {
            if (num % 10 == 7) {
                check = true;
            } else {
                check = false;
            }
        } else {
            if (num % 7 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;

    }

}
