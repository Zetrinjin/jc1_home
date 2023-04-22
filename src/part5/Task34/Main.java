package part5.Task34;

public class Main {

    public static void main(String[] args) {

        Credit credit =new Credit();
        System.out.println(credit.getName());
        credit.exp = 200;
        System.out.println(" expenses: " + credit.colculateExp(400));
        credit.sumPay(12,10);

        MoneyPay moneyPay = new MoneyPay();
        System.out.println(moneyPay.getName());
        moneyPay.setAccount(200);
        System.out.println("acc have: " + moneyPay.getAccount());
        moneyPay.payment(150);
        System.out.println("new money: " + moneyPay.getAccount());
    }
}
