package part5.Task37;

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


        do {
            chooseSeason = scan.nextInt();
        }while(chooseSeason<=1 && chooseSeason>=4);

        switch (chooseSeason){
            case 1: {
                SeasonOfYear seasonOfYear = SeasonOfYear.WINTER;
                seasonOfYear.nextSeason();
                break;
            }
            case 2: {
                SeasonOfYear seasonOfYear = SeasonOfYear.SPRING;
                seasonOfYear.nextSeason();
                break;
            }
            case 3: {
                SeasonOfYear seasonOfYear = SeasonOfYear.SUMMER;
                seasonOfYear.nextSeason();
                break;
            }
            case 4: {
                SeasonOfYear seasonOfYear = SeasonOfYear.AUTUMN;
                seasonOfYear.nextSeason();
                break;
            }
            default: {
                System.out.println("нет такого сезона");
                break;
            }
        }
    }
}
