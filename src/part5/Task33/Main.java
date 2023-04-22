package part5.Task33;

public class Main {
    public static void main(String[] args) {


        Fridge fridge = new Fridge(0.5,0.7);
        System.out.println(fridge.getname());
        fridge.off();
        fridge.totalVolt();
        fridge.printSocet();

        Microwave microwave=new Microwave(0.8,0.9);
        System.out.println(microwave.getname());
        microwave.on();
        microwave.totalVolt();
        microwave.printSocet();
    }
}
