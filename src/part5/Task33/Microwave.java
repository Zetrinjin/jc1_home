package part5.Task33;

public class Microwave extends SmallAppliances{

    protected double power;
    protected double cos;
    public Microwave(double power, double cos) {
        super(power, cos);
    }

    @Override
    public String getname() {
        return "Microwave";
    }
}
