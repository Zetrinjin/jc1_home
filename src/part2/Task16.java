package part2;

public class Task16 {
    public static void main(String[] args) {

        int i,num,simp,temp;

        num= 0;
        simp=0;

        for (i=50;i<70;i++){
            boolean check =true;
            for (int j=2; j<=i/2;j++) {//проверка на простое число
                temp = i%j;
                if (temp ==0) {//если оно простое меняем значение чек
                    check =false;
                }
            }

            if(check) {//если же значение не меняется записываем его в нужное
                simp += 1;
                if (simp == 2) {
                    num = i;
                    break;
                }
            }
            //System.out.println("chisla " + i);
            }
        System.out.println("find number = " + num );
        }
}

