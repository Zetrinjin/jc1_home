package part2;

public class Task13 {
    public static void main(String[] args) {

        int sum =1 ;
        int i =0;

        while(i<10){

            if(i==0){
                sum *= 1;
            }else {
                sum *= i;
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
