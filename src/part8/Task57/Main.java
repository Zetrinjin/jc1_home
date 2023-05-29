package part8.Task57;

public class Main {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        Thread t1 = new Thread(()->{

            System.out.println(Thread.currentThread().getName() + "start");

            synchronized (o1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o2){
                    synchronized (o3){

                    }
                }
            }
            System.out.println(Thread.currentThread().getName() + "end");
        },"Thread1");

        Thread t2 = new Thread(()->{

            System.out.println(Thread.currentThread().getName() + "start");
            synchronized (o2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o3){
                    synchronized (o1){

                    }
                }
            }
            System.out.println(Thread.currentThread().getName() + "end");
        },"Thread2");

        Thread t3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "start");
            synchronized (o3){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o1){
                    synchronized (o2){

                    }
                }
            }
            System.out.println(Thread.currentThread().getName() + "end");
        },"Thread3");


        t1.start();
        t2.start();
        t3.start();
    }
}
