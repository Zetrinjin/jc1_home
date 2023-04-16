package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {

        String str;
        int count= 0;
        Scanner scan = new Scanner(System.in);

        str =scan.nextLine();
        System.out.println(str);


        Pattern p = Pattern.compile("[\\p{Punct}\\p{IsPunctuation}]");
        Matcher m = p.matcher(str);

        while(m.find()){
            count+=1;
            //System.out.println(m.start() + " " + m.end());
        }

        System.out.println("количество знаков: " + count);
    }
}
