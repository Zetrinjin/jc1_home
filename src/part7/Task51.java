package part7;

import java.io.*;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) throws IOException {

        String name;
        Scanner scan = new Scanner(System.in);


        for(int i=0;i<5;i++){
            System.out.println("введите имя файла: ");
            name = scan.nextLine();
           // System.out.println(name);
            File file =new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third",name.concat(".txt"));
            FileOutputStream fos = new FileOutputStream(file);

        }

        File dir =new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third");

        /*FileOutputStream fos = new FileOutputStream("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third\\as.txt");
        for(int i=0;i<10;i++){
            int num;
            num=(int)(1 + Math.random()*15);
            String number= Integer.toString(num) + " ";
            fos.write(number.getBytes());
        }*/

        if(dir.isDirectory()){

            for(File item:dir.listFiles()){
                //DataOutputStream dos = new DataOutputStream(new FilterOutputStream(item));
                FileOutputStream fos = new FileOutputStream(item);
                for(int i=0;i<10;i++){
                    int num;
                    num=(int)(1 + Math.random()*15);
                    String number= Integer.toString(num) + " ";
                    /*String nam = item.getName();
                    System.out.println(nam);*/
                    fos.write(number.getBytes());
                }
                //System.out.println(item.getName() + "\t file");
            }
        }


        //fileName();



        if(dir.isDirectory()){
            for(File item:dir.listFiles()) {
                FileInputStream fis = new FileInputStream(item);
                int i;
                while((i=fis.read())!=-1){
                    System.out.print((char)i);
                }
                System.out.println(" ");
            }
        }

        fileNumber();
        fileName();


    }


    public static void fileNumber() throws IOException {

        try {
            File file = new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third\\FileNumber.txt");
            FileOutputStream fos = new FileOutputStream(file);

            File dir =new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third");
            if(dir.isDirectory()){

                for(File item:dir.listFiles()){
                    FileInputStream from = new FileInputStream(item);
                    int i;
                    //System.out.println(item.getName());
                    if(item.getName().equals("FileNumber.txt")){
                        continue;
                    }
                    while((i=from.read())!=-1){
                        fos.write((char)i);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void fileName() throws IOException {

        File file = new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third\\FileName.txt");
        FileOutputStream fos = new FileOutputStream(file);

        File dir =new File("C:\\Users\\Ginsai\\Desktop\\First\\Second\\Third");
        if(dir.isDirectory()){

            for(File item:dir.listFiles()){


                String nam = item.getName() + "\n";
                //System.out.println(nam);

                fos.write(nam.getBytes());

                //System.out.println(item.getName() + "\t file");
            }
        }
    }
}
