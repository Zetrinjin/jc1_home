package part8.Task60;

import part8.Task61.MyCallable;

import java.util.ArrayList;
import java.util.Date;
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

            List list = new ArrayList();

            for(int i=0;i<10;i++){
                list.add((int)(Math.random() *10));
            }


            int timeSleep = 1000 + (int)(Math.random() *(10000-1000) + 1000 );//от 1 до 10 сек
            Thread.sleep(timeSleep);

            int sum=0;
            for(int i=0;i<list.size();i++){
                int number=(int)list.get(i);
                sum+=number;
            }
            // возвращает имя потока, который выполняет callable таск
            return sum+ " " + Thread.currentThread().getName();
        }
    }
}
