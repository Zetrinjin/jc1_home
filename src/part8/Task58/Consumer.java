package part8.Task58;

public class Consumer extends Thread {
    public Consumer(){
        super("consumer");
    }
    @Override
    public void run() {
        RandomElements randomElements = RandomElements.getInstance();


        while (true) {
            randomElements.takeNumber();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
