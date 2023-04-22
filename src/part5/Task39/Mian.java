package part5.Task39;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {

        Garage<String> type1 = new Garage<>();
        Garage<String> type2 = new Garage<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("введите названеие транспорта: ");
        String name = scan.nextLine();
        type1.setNameOf(name);
        String s = type1.name();
        System.out.println(s);



    }
}
