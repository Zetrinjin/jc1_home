package part8.Task55;

public class Main {
    public static void main(String[] args) {

        NewThreadd t1 = new NewThreadd();
        NewThreadd t2 = new NewThreadd();
        NewThreadd t3 = new NewThreadd();
        NewThreadd t4 = new NewThreadd();
        NewThreadd t5 = new NewThreadd();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
