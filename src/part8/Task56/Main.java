package part8.Task56;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();

        NewClass t1 = new NewClass(obj);
        NewClass t2 = new NewClass(obj);
        NewClass t3 = new NewClass(obj);
        NewClass t4 = new NewClass(obj);
        NewClass t5 = new NewClass(obj);
        NewClass t6 = new NewClass(obj);
        NewClass t7 = new NewClass(obj);
        NewClass t8 = new NewClass(obj);
        NewClass t9 = new NewClass(obj);
        NewClass t10 = new NewClass(obj);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();
        t8.start();
        t8.join();
        t9.start();
        t9.join();
        t10.start();
        t10.join();

    }
}
