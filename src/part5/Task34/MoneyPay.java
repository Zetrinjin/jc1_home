package part5.Task34;

public class MoneyPay extends DebetCard{
    @Override
    public String getName() {
        return "Debut card";
    }

    @Override
    public double addSum(double sum) {
        return super.addSum(sum);
    }

    @Override
    public double addSum(double sum, double per) {
        return super.addSum(sum);
    }
}
