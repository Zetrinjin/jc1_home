package part2;

public class Task20 {
    public static void main(String[] args) {

        int arg[] = {1,3,5,7,9,2,4,6,8,13};

        for(int i=0;i<arg.length;i++){
            if(i%2==0){
                System.out.print(arg[i] + " ");
            }
        }
    }
}
