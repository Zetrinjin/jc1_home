package part5.Task34;

public class Credit extends CreditCard {

    @Override
    public String getName() {
        return "credit";
    }

    @Override
    public double sumPay(double period, double per) {
        sumPay = exp/period+exp/12;
        System.out.println("month pay: " + sumPay);
        return sumPay;
    }
}
