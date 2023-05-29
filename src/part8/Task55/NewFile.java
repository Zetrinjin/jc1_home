package part8.Task55;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFile {
    public void NewFil() throws FileNotFoundException {

        try {
            File createFile = new File("C:\\Users\\Ginsai\\Desktop\\tet.txt");
            FileOutputStream fos =new FileOutputStream(createFile);

            int[] array =new int[10];
            for (int i=0;i< array.length;i++){
                array[i] = (int) (1 + Math.random()*10);
            }


            for (int i=0;i< array.length;i++) {
                String number= Integer.toString(array[i]) + " ";

                fos.write(number.getBytes());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
