package part2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        int sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("input sum of money: ");
        sum = scan.nextInt();

        if(sum<=10)
        {
            if(sum%10 == 0){
                System.out.println(sum + " рублей");
            }else if (sum%10==1){
                System.out.println(sum + " рубль");
            }else if (sum%10>=2 && sum%10<=4){
                System.out.println(sum + " рубля");
            }else if (sum%10 >=5){
            System.out.println(sum + "рублей");
            }

        } else if (sum>=10) {

            if(sum%100 >=10 && sum%100 <=20){
                System.out.println(sum + " рублей");
            }else if(sum%10 == 0){
                System.out.println(sum + " рублей");
            }else if (sum%10==1){
                System.out.println(sum + " рубль");
            }else if (sum%10>=2 && sum%10<=4){
                System.out.println(sum + " рубля");
            }else if (sum%10 >=5){
                System.out.println(sum + "рублей");
            }
        }

    }
}
