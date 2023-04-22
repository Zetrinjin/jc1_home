package part5.Task33;

public class Fridge extends BigAppliances{

    protected double power;
    protected double cos;
    public Fridge(double power,double cos) {
        super(power,cos);
    }

    @Override
    public String getname() {
        return "Fridge";
    }
}
