package part2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        int day;
        Scanner scan = new Scanner(System.in);


        do{
            System.out.println("input day number from 1 to 7: ");
            day = scan.nextInt();
        }while(!(day>0 && day<8));

        week(day);
    }
//todo
    static void week(int day){
        System.out.println("1:Понедельник"+"\n"+
                           "2:Вторник" + "\n"+
                           "3:Среда" + "\n"+
                           "4:Четверг" + "\n"+
                           "5:Пятница" + "\n"+
                           "6:Суббота" + "\n"+
                           "7:Воскресенье" + "\n");
        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("ВОскресенье");
                break;
            default:
                System.out.println("нет такого дня");
                break;
        }
    }
}
