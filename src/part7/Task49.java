package part7;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Task49 {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Ginsai\\Desktop\\numbers.txt";
        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(fileName);//создание

            String numbers = "1 2 3 4 5 6 3 2 ";

            fos.write(numbers.getBytes());

            Scanner scanner = new Scanner(file);
            int sum = 0;
            Set<Integer> frag = new HashSet<>();
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                frag.add(number);
                sum += number;
                System.out.print(number + " "); // => 1 2 3 4 5 6

            }
            System.out.println("");

            String str =frag.toString();

            System.out.println(str);

            FileOutputStream foc = new FileOutputStream(fileName);

            foc.write(str.getBytes());

            List<Integer> arrayListWithout =new ArrayList<>(frag);
            /*for (int i=0;i<arrayListWithout.size();i++){
                System.out.print(arrayListWithout.get(i) + " ");
            }*/

            System.out.println("");

            int i;

           /* for( i=0;i< arrayListWithout.size();i++){
                fos.write(arrayListWithout.get(i));
            }*/

            FileInputStream fis = new FileInputStream("C:\\Users\\Ginsai\\Desktop\\numbers.txt");

            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }

            System.out.println("\n" + "sum:" + sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

