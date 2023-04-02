package part2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int day,month,year;
        Scanner scan = new Scanner(System.in);

        System.out.println("введите день: ");
        day = scan.nextInt();
        System.out.println("введите месяц: ");
        month=scan.nextInt();
        System.out.println("введите год: ");
        year = scan.nextInt();

        System.out.println("введенная дата:" + day+ "." + month + "." + year);

        if(day==28 && month==2 && year%4==0 && year%100!=0 || year%400==0){
            System.out.println("затра:" + (day+1) + "." + month + "." + year);
        }else if(month==2){
            if(day>=1 && day<28)
            {
                System.out.println("затра:" + (day+1) + "." + month + "." + year);
            }else {
                System.out.println("затра:" + 1 + "." + (month+1) + "." + year);
            }
        }else if(month== 1 || month==3 || month== 5 || month==7 || month ==8 || month==10 ){
            if(day>=1 && day<31)
            {
                System.out.println("затра:" + (day+1) + "." + month + "." + year);
            }else {
                System.out.println("затра:" + 1 + "." + (month+1) + "." + year);
            }
        }else if(month== 4 || month==6 || month== 9 || month==11 ){
            if(day>=1 && day<30)
            {
                System.out.println("затра:" + (day+1) + "." + month + "." + year);
            }else {
                System.out.println("затра:" + 1 + "." + (month+1) + "." + year);
            }
        }else if(month==12){
            if(day>=1 && day<31)
            {
                System.out.println("затра:" + (day+1) + "." + month + "." + year);
            }else {
                System.out.println("затра:" + 1 + "." + 1 + "." + (year+1));
            }
        }
    }
}
