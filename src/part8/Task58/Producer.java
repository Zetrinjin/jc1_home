package part8.Task58;

public class Producer extends  Thread{

    @Override
    public void run() {
        RandomElements randomElements = RandomElements.getInstance();


        for(int i=0;i<20;i++){
            randomElements.addNumber((int)((Math.random() * ((100 - 1) + 1)) + 1));
            System.out.println("number: " +i);
            try {
                Thread.sleep(500);//тут милисекунды потому и 5000
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
