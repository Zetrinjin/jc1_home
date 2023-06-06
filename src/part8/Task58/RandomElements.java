package part8.Task58;

import java.util.ArrayList;
import java.util.List;

public class RandomElements {

    private static RandomElements randomElements = new RandomElements();

    public static RandomElements getInstance(){
        return randomElements;
    }

    private RandomElements(){};
    private List<Integer> goods = new ArrayList<Integer>();

    public synchronized void addNumber(Integer n){
        while (goods.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(goods.size()<=8){
            notifyAll();
        }

        goods.add(n);
        System.out.println(Thread.currentThread().getName() + " adds " + n + "[" + goods.size() + "]");

    }

    public synchronized Integer takeNumber() {

        while (goods.size() == 0) {
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        notifyAll();
        Integer n = goods.remove(0);
        System.out.println(Thread.currentThread().getName() + " takes " + n +"[" + goods.size() + "]");
        return n;

    }
}
