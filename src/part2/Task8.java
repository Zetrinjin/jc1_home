package part2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task8 {
    public static void main(String[] args) {

        int a,b,r;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the rectangles data: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("enter the circle data");
        r = scan.nextInt();

        //TODO
        if(sqrt(a*a + b*b)<2*r){//сравниваем дигональ с диаметром
            System.out.println("fit");
        }else {
            System.out.println("not fit");
        }
    }
}
