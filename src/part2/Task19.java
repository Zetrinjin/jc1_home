package part2;

public class Task19 {
    public static void main(String[] args) {

        int arg[] = {1,3,5,7,9,2,4,6,8,13};
        int num;

        //todo
        for(int i=0;i<arg.length;i++){
            num = arg[i];
            System.out.println(num + " ");
        }
        num = arg[arg.length-1];//записываем последний элемент массива
        System.out.println(num);
    }
}
