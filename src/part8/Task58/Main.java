package part8.Task58;

public class Main {
    public static void main(String[] args) {
        new Producer().start();
        new Producer().start();
        new Producer().start();
        new Consumer().start();
        new Consumer().start();
    }
}
