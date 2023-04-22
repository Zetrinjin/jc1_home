package part5.Task35;

public class PercPay extends HourPay{

    @Override
    public String getJob() {
        return "work B ";
    }

    @Override
    public String getTypePay() {
        return "percent payment ";
    }

    public double pay(double salesAmount, double perc){
        System.out.println("sum of sales: " + salesAmount);
        salary = salesAmount*(perc/100);
        return salary;
    }
}
