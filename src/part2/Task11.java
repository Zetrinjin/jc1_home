package part2;

public class Task11 {
    public static void main(String[] args) {

        int a=3,b=2;
        int c=5,d=3;
        int e=10,f=8;

        if(e>(a+c) && (f>d||f>d))
        {
            System.out.println("дома поместяться");
        }else if((e>a || e>c) && f>(b+d)){
            System.out.println("дома поместяться");
        }else{
            System.out.println(" дома не поместяться");
        }
    }
}
