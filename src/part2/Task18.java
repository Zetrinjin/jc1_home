package part2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Task18 {
    public static void main(String[] args) {

        int num = 20023143;

        DecimalFormatSymbols symbol= new DecimalFormatSymbols();//создаем объект
        symbol.setGroupingSeparator(' ');//указываем разделитель
        DecimalFormat df = new DecimalFormat("#,###",symbol);//еще один объект
        String number = df.format(num);//для стрингов

        System.out.println(number);
    }
}
