package part8.Task54;

import java.util.ArrayList;
import java.util.List;

public class NewThread implements Runnable {


    Thread th;
    public NewThread(){
        th =new Thread(this);
    }

    public void run(){
        int[] array =new int[10];
        for (int i=0;i< array.length;i++){
            array[i] = (int) (1 + Math.random()*10);
        }



        int max=array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        //текущее имя потока
        System.out.println("имя потока: " + th.currentThread().getName() + " макс значение: " +max);
    }

    void start(){
        th.start();
    }
}
