package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//xaF851Bxxx-3f6Cxx-2Ad9eExx70ae19xxx
public class Task30 {

    public static void main(String[] args) {

        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("введите строку: ");
        str = scan.nextLine();

        Pattern p=Pattern.compile("-?[0-9a-fA-F]+");//для поиска 16чных чисел
        Matcher m = p.matcher(str);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
