package part9;

public class Task62 {
    public static void main(String[] args) {

        Runnable runnable = ()->method();
        new Thread(runnable).start();

    }


    public static void method(){

        double sum =0;
        double change=0;
        for(int i = 1;i<21;i++){
            if(i%2==0){
                System.out.println("дюймов: " + i);
                 change = i*(2.54);
                 sum +=change;
            }
        }
        System.out.println("сумма: " +sum);
    }
}
