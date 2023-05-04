package part6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task42 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();
        Integer max=Integer.MIN_VALUE;

        for(int i=0;i<8;i++){
            arrayList.add(getRandom());
        }

        Iterator iterator = arrayList.iterator();

        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println(" ");


        while(iterator.hasNext()){
            Integer integer = (Integer)iterator.next();
            if(max<integer){
                max = integer;
            }
            //System.out.print(iterator.next() + " ");
        }

        System.out.println("макс оценка: " + max);
    }

    public static int getRandom(){
        return (int)(Math.random()*11);
    }
}
