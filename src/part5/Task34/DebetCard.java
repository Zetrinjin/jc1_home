package part5.Task34;

public abstract class DebetCard  extends Card{

    private double remain;
    @Override
    public String getName() {
        return "Debut card";
    }

    public double addSum(double sum){
        remain = this.getAccount() + sum;
        System.out.println("add money: " + sum + " remain money: " + remain);
        setAccount(remain);
        return remain;
    }

    public abstract double addSum(double sum, double per);
}
