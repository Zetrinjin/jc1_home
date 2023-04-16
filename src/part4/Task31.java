package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("введите строку: ");
        str = scan.nextLine();

        Pattern p=Pattern.compile("<^p>|<p[^<>]+>");
        Matcher m = p.matcher(str);

        System.out.println(str.replaceAll("<^p>|<p[^<>]+>","<p>"));

    }
}
