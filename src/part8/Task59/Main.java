package part8.Task59;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> list = new ArrayList<Future<String>>();

        Callable<String> callable = new MyCallable();


        for(int i = 0;i<10;i++){

            Future<String> future = executor.submit(callable);

            list.add(future);
        }

        for(Future<String> fut : list){
            try {

                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
    public static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            String[] name ={"q","w","e","r","a","s","d","f","z","x"};

            for (int i=0;i<name.length;i++) {
                String nameFile = name[i];
                File file = new File("C:\\Users\\Ginsai\\Desktop\\random", nameFile.concat(".txt"));
                FileOutputStream fos = new FileOutputStream(file);

            }

            File dir =new File("C:\\Users\\Ginsai\\Desktop\\random");

            if(dir.isDirectory()){

                for(File item:dir.listFiles()){
                    DataOutputStream dos =new DataOutputStream(new FileOutputStream(item));
                    //FileOutputStream fos = new FileOutputStream(item);
                    for(int i=0;i<10;i++){
                        int num;
                        num=(int)(1 + Math.random()*15);
                        String number= Integer.toString(num) + " ";

                        dos.writeChars(number);
                    }
                }
            }

            List list = new ArrayList<>();

            if(dir.isDirectory()){
                for(File item:dir.listFiles()){
                    String nam = item.getName() + "\n";
                    list.add(nam);
                    //System.out.println(nam);
                    //System.out.println(item.getName() + "\t file");
                }
            }


            int timeSleep = 1000 + (int)(Math.random() *(3000-1000) + 1000 );//от 1 до 3 сек
            Thread.sleep(timeSleep);
            // возвращает имя потока, который выполняет callable таск
            return Thread.currentThread().getName();
        }
    }
}
