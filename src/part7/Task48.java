package part7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = null;//создание
        try {
            File createFile = new File("C:\\Users\\Ginsai\\Desktop\\tet.txt");//создание файла

            fos = new FileOutputStream(createFile);

            String greetings = "asd sdf dfge. kop , pqw? sq. ahox mdk";

            fos.write(greetings.getBytes());//запись в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedInputStream dis = (new BufferedInputStream(new FileInputStream("C:\\Users\\Ginsai\\Desktop\\tet.txt")));

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ginsai\\Desktop\\tet.txt"));

            //FileInputStream fis = new FileInputStream("C:\\Users\\Ginsai\\Desktop\\tet.txt");//чтение

            String ser = br.readLine();

            List list =new ArrayList<>();

            while(ser!=null){
                System.out.println(ser);
                list.add(ser);
                ser = br.readLine();
            }

            System.out.println(" ");

            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }

            String line;

            line = list.toString();

            Pattern p=Pattern.compile("[a-zA-z]+");//для слов
            Matcher m = p.matcher(line);

            //System.out.println(line);
            int words=0;

            while(m.find()){
                words+=1;
            }

            Pattern s = Pattern.compile("[\\p{Punct}\\p{IsPunctuation}]");//для знаков
            m = s.matcher(line);

            int coma=0;

            while(m.find()){
                coma+=1;
            }

            System.out.println(" ");
            System.out.println("слов в тексте: " + words + " количество знаков: " +coma);

           /* FileReader reader = new FileReader("C:\\Users\\Ginsai\\Desktop\\tet.txt");

            List list =new ArrayList<>();

            int res = reader.read();
            while(res!=-1){
                System.out.print((char)res);
                list.add((char)res);
                res=reader.read();
            }

            System.out.println(" ");

            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }

            int i;

           /* while((i=fis.read())!=-1){
                System.out.print((char)i);
            }

            int punkt=0;

            System.out.println("");

            while((i=fis.read())!=-1){
                if(i==(byte)','){
                    punkt+=1;
                }
            }

            System.out.println(punkt);*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
