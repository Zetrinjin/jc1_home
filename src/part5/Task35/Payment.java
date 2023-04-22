package part5.Task35;

public abstract class Payment {
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public abstract String getJob();
    public abstract String getTypePay();

}

