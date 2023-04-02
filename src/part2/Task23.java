package part2;

public class Task23 {
    public static void main(String[] args) {

        int arg[] = {1,4,5,7,9,2,4,6,8,13};
        int min =arg[0];
        int max= arg[arg.length-1];
        int swap,j;

        for(int i=0;i<arg.length;i++){
            System.out.print(arg[i]+ " ");
        }

        System.out.println("");

        j=arg.length-1;
        for(int i=0;i<arg.length;i++){

            if(i>j){
                break;
            }

            min =arg[i];
            max = arg[j];


            swap = min;
            arg[i] = max;
            arg[j] = swap;
            j--;
        }
        for(int i=0;i<arg.length;i++){
            System.out.print(arg[i] + " ");
        }
    }
}
