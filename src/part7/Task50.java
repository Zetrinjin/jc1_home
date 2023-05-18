package part7;

import java.io.*;
import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) throws IOException {

        try {
            DataOutputStream number = new DataOutputStream(new DataOutputStream(new FileOutputStream("C:\\Users\\Ginsai\\Desktop\\hello.txt")));
            int num;
            for(int i=0;i<20;i++){
               num=(int) (1+Math.random() * 9);
                //System.out.print(num + " ");
               number.writeInt(num);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" ");
        int total;
        int sum = 0;
        int i=0;

        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Ginsai\\Desktop\\hello.txt")));


            try {//выполняется один раз и выдает ошибку
                while(true){

                    int num = dis.readInt();

                    sum +=num;
                    if(i==19){
                        System.out.println("\n" + " сумма: " + sum);
                        total = sum/20;
                        System.out.println("среднее арифм: " +total);
                    }
                    i++;
                    //System.out.println("значение i: " + i );
                    System.out.print(num + " ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                dis.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("ioerror " +"hello.txt " + "not found" );
        }catch (IOException e){
            System.out.println(e.getMessage());

        }

        //total =sum/20;

        /*Scanner scanner = new Scanner(number);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int numb = scanner.nextInt();
            sum+=numb;
            System.out.print(numb + " "); // => 1 2 3 4 5 6

        }

        int total;

        total = sum/20;*/
    }
}
