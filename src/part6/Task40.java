package part6;

import java.util.ArrayList;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {

        List<Integer> arrayList =new ArrayList<Integer>();



        for(int i=0;i<20;i++){

            arrayList.add(getRandom());
        }

        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }

        for (int i=0;i<arrayList.size();i++) {
            if(arrayList.get(i)<=3){
                arrayList.remove(i);
                i--;
            }
        }

        System.out.println(" ");


        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }

    }
    public static int getRandom(){
        return (int)(Math.random()*11);
    }
}
