package part5.Task34;

public abstract class CreditCard extends Card{
    @Override
    public String getName() {
        return "Credit card";
    }

    public double exp;
    public double sumPay;

    public double colculateExp(double exp){
        return this.exp += exp;
    }

    public abstract double sumPay(double period, double per);
}
