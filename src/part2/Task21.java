package part2;

public class Task21 {
    public static void main(String[] args) {

        int arg[] = {1,3,5,7,9,2,4,6,8,13};
        int index = arg[0];

        int max = arg[0];
        for(int i=0;i<arg.length;i++){
            if(max<arg[i]){
                max=arg[i];
                index=i;
            }
        }
        System.out.println("index: " + index + " max number: " + max);
    }
}
