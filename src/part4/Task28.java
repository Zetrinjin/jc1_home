package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {

        String str;
        int count=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("введите строку: ");
        str = scan.nextLine();

        Pattern p=Pattern.compile("[a-zA-z]+");
        Matcher m = p.matcher(str);

        while(m.find()){
            count+=1;
        }
        System.out.println("количество слов: " +count);
    }
}
