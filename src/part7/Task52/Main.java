package part7.Task52;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] names = {"Аня","Юля","Катя","Никита","Паша","Дима","Женя"};
        String[] surnames = {"Попов","Сидоров","Смирнов","Петров","Кузнецов","Зайцев"};

        Random generator = new Random();
        Person person =new Person();

        try {
            File file = new File("C:\\Users\\Ginsai\\Desktop\\tet.txt");
            //FileOutputStream fos = new FileOutputStream("C:\\Users\\Ginsai\\Desktop\\tet.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ginsai\\Desktop\\tet.txt"));

            ArrayList<Person> people = new ArrayList<Person>();
            for(int i=0;i<10;i++){



                int randomIndexName = generator.nextInt(names.length);
                person.setName(names[randomIndexName]);

                int randomIndexSurname = generator.nextInt(surnames.length);
                person.setSurname(surnames[randomIndexSurname]);

                int ageNumber = (int)((Math.random() * ((30 - 15) + 1)) + 15);
                person.setAge(ageNumber);

                people.add(new Person(names[randomIndexName], surnames[randomIndexSurname], ageNumber));


            }
            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Person> newPeople= new ArrayList<Person>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Ginsai\\Desktop\\tet.txt")))
        {

            newPeople=((ArrayList<Person>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }


}

