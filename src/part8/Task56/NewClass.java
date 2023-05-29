package part8.Task56;

public class NewClass extends Thread {

    Object o;
    public NewClass(Object s){
        o=s;
    }
    public void run() {
        synchronized (o){


            String name = Thread.currentThread().getName();
            System.out.println(name);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
