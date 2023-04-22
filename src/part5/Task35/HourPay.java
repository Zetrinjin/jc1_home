package part5.Task35;

public class HourPay extends Payment{

    protected double workDay;
    protected double salary;

    public void setWorkDay(double workDay){
        this.workDay = workDay;
    }

    @Override
    public String getJob() {
        return "work A ";
    }

    @Override
    public String getTypePay() {
        return "hour payment ";
    }

    public double pay(double hourWork){
        System.out.println("money: " + getRate() + " hour in month: " + hourWork);
        salary = (getRate()/workDay/7)*hourWork;
        return salary;
    }
}
