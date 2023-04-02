package part2;

public class Task14 {
    public static void main(String[] args) {

        int sum=1;
        int i=1;

        do{
            sum*=i;
            i++;

        }while(i<25);

        System.out.println("sum = " + sum);
    }
}
