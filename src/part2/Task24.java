package part2;

//todo
public class Task24 {
    public static void main(String[] args) {

        int arg[][] = new int[6][6];

        System.out.println(arg.length);

        for (int i = 0; i < arg.length / 2 + 1; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if ((j < i) || (j >= (arg[i].length - i)))
                    arg[i][j] = 0;
                else
                    arg[i][j] = 1;
            }
        }
        for (int i = arg.length - 1; i >= arg.length / 2; i--) {
            for (int j = 0; j < arg[i].length; j++) {
                if ((j < (arg[i].length - 1 - i)) || (j > i))
                    arg[i][j] = 0;
                else
                    arg[i][j] = 1;
            }
        }

        for(int i = 0;i<arg.length;i++) {
            System.out.println(" ");
            for (int j = 0; j < arg.length; j++) {
                System.out.print(arg[i][j] + " ");
            }
        }

        }
    }

