package part5.Task35;

public class Main {
    public static void main(String[] args) {

        HourPay hourPay = new HourPay();
        hourPay.setRate(500);
        System.out.println(hourPay.getJob() + " " + hourPay.getTypePay());
        hourPay.setWorkDay(15);
        System.out.println("salary: " + hourPay.pay(120));

        MixPay mixPay = new MixPay();
        System.out.println(mixPay.getJob() + " " + mixPay.getTypePay());
        mixPay.setRate(900);
        mixPay.setWorkDay(20);
        System.out.println("salary: " + mixPay.pay(150,2000,2));
    }
}
