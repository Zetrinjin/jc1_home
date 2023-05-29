package part8.Task55;

import java.io.FileNotFoundException;

public class NewThreadd implements Runnable{
    Thread th;
    public NewThreadd(){
        th =new Thread(this);
    }

    public void run(){

        NewFile nw = new NewFile();
        try {
            nw.NewFil();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    void start(){
        th.start();
    }
}
