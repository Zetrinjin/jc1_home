package part5.Task34;

public abstract class Card {

    private double account;

    public abstract String getName();

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public void payment(double sumPay ){
        if(sumPay<= this.account)
        {
            System.out.println("is done: " + sumPay);
            this.account -=sumPay;
        }else{
            System.out.println("not enoght money");
        }
    }
}
