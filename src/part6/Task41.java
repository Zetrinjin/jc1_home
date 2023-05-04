package part6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task41 {
    public static void main(String[] args) {

        List<Integer> arrayList =new ArrayList<Integer>();



        for(int i=0;i<20;i++){

            arrayList.add(getRandom());
        }

        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }

        //создаем с переносом туда arrayList для удаления повторов
        //Linked нужен для упорядочивания что и в arrayList
        Set<Integer> set = new LinkedHashSet<>(arrayList);

        //для получения нового листа без повторов
        List<Integer> arrayListWithout =new ArrayList<>(set);

        System.out.println(" ");

        //System.out.println(set);


        for (int i=0;i<arrayListWithout.size();i++){
            System.out.print(arrayListWithout.get(i) + " ");
        }

    }
    public static int getRandom(){
        return (int)(Math.random()*11);
    }
}
