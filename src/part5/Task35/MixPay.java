package part5.Task35;

public class MixPay extends PercPay{
    @Override
    public String getJob() {
        return "work C ";
    }

    @Override
    public String getTypePay() {
        return "mix payment ";
    }

    public double pay(double hourWork, double inc , double perc){
        System.out.println("money: " + getRate() + " hour in month: " + hourWork + " per sales: " + perc);
        salary = super.pay(hourWork) + super.pay(inc,perc);
        return salary;
    }
}
