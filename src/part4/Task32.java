package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task32 {
    public static void main(String[] args) {
        String str,str2;
        Scanner scan = new Scanner(System.in);
        StringBuilder str3 = new StringBuilder("");
        str2="";

        str = "aaabbbccc";

        Pattern p=Pattern.compile("[\t\n]");
        Matcher m = p.matcher(str);

        double strs = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            str2 +=str;
        }
        double stre=System.currentTimeMillis();

        //System.out.println(str2);

        double strbs =System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            str3.append(str);
        }
        double strbe =System.currentTimeMillis();

        String result1 = String.format("первая итерация: %.5f" , (stre-strs) );
        System.out.println(result1);
        String result2 = String.format("вторая итерация: %.5f", (strbe-strbs));
        System.out.println(result2);

        if((stre-strs)>(strbe-strbs)){
            System.out.println("первая итерация больше по времени");
        }else if((stre-strs)<(strbe-strbs)){
            System.out.println("вторая итерация больше по времени");
        }else {
            System.out.println("они равны");
        }

        //System.out.println(str3);
    }
}
