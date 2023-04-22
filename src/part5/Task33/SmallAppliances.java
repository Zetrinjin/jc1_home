package part5.Task33;

public class SmallAppliances extends Appliances implements Electricity{

    protected double power;
    protected double cos;

    protected boolean socket;

    public SmallAppliances(double power,double cos) {
        this.power = power;
        this.cos = cos;
    }

    public void totalVolt(){
        System.out.println("volt = " + power/(volt*cos) );
    }

    @Override
    public void on() {
        this.socket =true;
    }

    @Override
    public void off() {
        this.socket =false;
    }

    @Override
    public boolean printSocet() {
        System.out.println(getname() + " is on : " + socket);
        return socket;
    }

    @Override
    public String getname() {
        return "small appliance";
    }
}
