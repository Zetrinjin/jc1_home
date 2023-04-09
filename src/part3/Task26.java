package part3;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        int sum, count,num;//num - какой номинал, count- количество номинала,sum - сумма для снятия
        Scanner scan = new Scanner(System.in);
        Atm bank = new Atm(10, 10, 10);

        do {
            System.out.println("введите номинал для добавления в банк:" + "\n" +
                    "1: купюра в 20 ед" + "\n" +
                    "2: купюра в 50 ед" + "\n" +
                    "3: купюра в 100 ед" + "\n" +
                    "999: для выхода" + "\n" );

            num = scan.nextInt();//какой номинал мы вводим
            String name = "";

            switch (num) {//добавление денег в автомат
                case 1: {
                    name = "twenty";
                    System.out.println("введите количество купюр");
                    count = scan.nextInt();
                    bank.addMoney(name, count);
                    break;
                }
                case 2: {
                    name = "fifth";
                    System.out.println("введите количество купюр");
                    count = scan.nextInt();
                    bank.addMoney(name, count);
                    break;
                }
                case 3: {
                    name = "hundr";
                    System.out.println("введите количество купюр");
                    count = scan.nextInt();
                    bank.addMoney(name, count);
                    break;
                }
                default: {
                    break;
                }
            }

            bank.dispay();
        } while (num != 999);

        sum = take();//снятие денг

        if (bank.getMoney(sum)) {//проверка на успешность снятия
            System.out.println("операция прошла успешно");
        } else {
            System.out.println("операция не удалась");
        }


    }

    static int take(){//метод для снятия денег
        System.out.println("введите сумму для снятия:");
        Scanner scan = new Scanner(System.in);

        int sum;

        sum=scan.nextInt();

        return sum;
    }
}

class Atm{

    private int num20;
    private int num50;
    private int num100;

    public final static String TWENTY ="twenty";
    public final static String FIFTH ="fifth";
    public final static String HUNDR ="hundr";

    public Atm(int num20, int num50, int num100){
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public int getNum20() {
        return num20;
    }

    public void setNum20(int num20) {
        this.num20 = num20;
    }

    public int getNum50() {
        return num50;
    }

    public void setNum50(int num50) {
        this.num50 = num50;
    }

    public int getNum100() {
        return num100;
    }

    public void setNum100(int num100) {
        this.num100 = num100;
    }

    public int getAll(){
        return num100 * 100 + num50 * 50 + num20 * 20;
    }//высчитывание общей суммы в атм

    public void addMoney(String name, int count){//добавление денег в банкомат
        switch(name) {
            case (TWENTY): {
                this.num20 += count;
                break;
            }
            case (FIFTH): {
                this.num50 += count;
                break;
            }
            case (HUNDR): {
                this.num100 += count;
                break;
            }
            default:
                break;
        }

        }

        //по хорошему надо переделать математику выдачи денег
    public boolean getMoney(int sum) {//выдача денег
        if (sum > getAll()) {
            return false;
        } else if (sum % 10 != 0) {
            return false;
        } else {
            int num100Count = sum / 100;
            System.out.println(num100Count + " ");
            int num50Count = (sum - num100Count * 100) / 50;
            int num20Count = (sum - num100Count * 100 - num50Count * 50) / 20;

            System.out.println("100: " + num100Count +"\n" +
                                "50:" + num50Count + "\n" +
                                "20:" + num20Count + "\n" );

        }
        return true;
    }

    public void dispay(){//вывод всех данных банкомата
        System.out.println("все деньги:" + getAll() +"\n"  +
                 "kup-20: " + num20 + "\n" +
                "kup-50:" + num50 + " "+ "\n" +
                "kup-100:" + num100 + "\n" );
    }

}
