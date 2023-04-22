package part5.Task38;

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
                SeasonYear seasonYear = SeasonYear.valueOf("WINTER");
                seasonYear.countOfDay();
                break;
            }
            case 2: {
                SeasonYear seasonYear = SeasonYear.valueOf("SPRING");
                seasonYear.countOfDay();
                break;
            }
            case 3: {
                SeasonYear seasonYear = SeasonYear.valueOf("SUMMER");
                seasonYear.countOfDay();
                break;
            }
            case 4: {
                SeasonYear seasonYear = SeasonYear.valueOf("AUTUMN");
                seasonYear.countOfDay();
                break;
            }
            default: {
                System.out.println("нет такого сезона");
                break;
            }
        }
        System.out.println();
    }

}
