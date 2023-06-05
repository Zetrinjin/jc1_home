package part9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Task64 {
    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();

        //Stream stream = list.stream();

        Check check =new Check();

        int n,minValue,maxValue;
        n=10;
        minValue = 1;
        maxValue =21;

        for(int i=0;i<n;i++){

            int number = maxValue+(int)(Math.random()*(maxValue-minValue) + minValue);
            System.out.println(number + " ");

            list.add(number);

        }

        if(check.checkThis(list)){
            System.out.println("такое число есть");
        }else {
            System.out.println("нет такого числа");
        }


    }

    public static class Check{

        public boolean  checkThis(List<Integer> list){

            return list.stream()
                    .filter(Objects::nonNull)
                    //.filter(x->x%3==0 && x%5==0)//не подходит для работы с булиан
                    .anyMatch(x->x%3==0 && x%5==0);//подходит для работы с болиан
        }

    }
}
