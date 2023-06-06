package part2;

public class Task22 {
    public static void main(String[] args) {

        int arg[] = {4,5,1,7,9,2,3,14,8,6};
        int max = arg[0];
        int min =arg[0];
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;

        for(int i=0;i<arg.length;i++){
            if(arg[i]>=arg[indexMax]){
                indexMax=i;
            }else if(arg[i]<arg[indexMin]){
                indexMin = i;
            }
        }

        System.out.println("min index: " + indexMin);
        System.out.println("max index: " + indexMax);
        for(int j=indexMin+1;j<indexMax;j++){//todo
           // System.out.println(j);
            sum+=arg[j];
        }

        System.out.println("sum of elem: " + sum);
    }
}
