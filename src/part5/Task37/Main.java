package part5.Task37;

import part5.Task36.SeasonOfYear;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chooseSeason;

        System.out.println("выберите сезон:" + "\n" +
                            "1:зима" + "\n" +
                            "2:весна" + "\n" +
                            "3:лето" + "\n" +
                            "4:осень" + "\n" );

        //todo
        do {
            chooseSeason = scan.nextInt();
        }while(chooseSeason<=1 && chooseSeason>=4);

        switch (chooseSeason){
            case 1: {
                part5.Task37.SeasonOfYear seasonOfYear = part5.Task37.SeasonOfYear.valueOf("WINTER");
                System.out.println(seasonOfYear);
                break;
            }
            case 2: {
                part5.Task37.SeasonOfYear seasonOfYear = part5.Task37.SeasonOfYear.valueOf("SPRING");
                System.out.println(seasonOfYear);
                break;
            }
            case 3: {
                part5.Task37.SeasonOfYear seasonOfYear = part5.Task37.SeasonOfYear.valueOf("SUMMER");
                System.out.println(seasonOfYear);
                break;
            }
            case 4: {
                part5.Task37.SeasonOfYear seasonOfYear = part5.Task37.SeasonOfYear.valueOf("AUTUMN");
                System.out.println(seasonOfYear);
                break;
            }
            default: {
                System.out.println("нет такого сезона");
                break;
            }
        }
    }
}
