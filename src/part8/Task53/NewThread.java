package part8.Task53;

import java.util.ArrayList;
import java.util.List;

public class NewThread implements Runnable {

    Thread th;
    public NewThread(){
        th =new Thread(this);
    }

    public void run(){
        List<Integer> al =new ArrayList<Integer>();



        for(int i=0;i<10;i++){

            al.add((int) (1 + Math.random()*10));
        }

        int sum = 0;
        int aver=0;
        for (int i=0;i<al.size();i++){
            sum += al.get(i);
        }
        aver=sum/10;
        System.out.println("среднее арифметическое: " + aver);
    }

    void start(){
        th.start();
    }
}
