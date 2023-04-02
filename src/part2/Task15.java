package part2;

public class Task15 {
    public static void main(String[] args) {

        long  num ;
        num = 7893823445L;
        int sum = 0;

        do{
            sum+=num%10;
            num/=10;

        }while(num>0);

        System.out.println("sum = " + sum);
    }
}
