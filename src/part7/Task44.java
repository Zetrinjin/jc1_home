package part7;

import java.io.IOException;

public class Task44 {
    public static void main(String[] args) {


        //num = new Integer(null);
        try {
            Integer num =null;
            doSomething(num);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.exit(0);
        }

       //System.out.println(num.toString());

    }

    public static void doSomething(Integer num){

        System.out.println(num.toString());

    }
}
