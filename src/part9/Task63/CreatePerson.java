package part9.Task63;

import java.util.*;

public class CreatePerson {

   // Set<Person> set =new HashSet<>();

    Person person =new Person();

    String[] names = {"Аня","Юля","Катя","Никита","Паша","Дима","Женя"};
    String[] surnames = {"Попов","Сидоров","Смирнов","Петров","Кузнецов","Зайцев"};

    Random generator = new Random();

    public List<Person> create(List list){

        List listt = list;

        for(int i=0;i<100;i++){

            int randomIndexName = generator.nextInt(names.length);
            person.setName(names[randomIndexName]);

            int randomIndexSurname = generator.nextInt(surnames.length);
            person.setSurname(surnames[randomIndexSurname]);

            int ageNumber = (int)((Math.random() * ((30 - 15) + 1)) + 15);
            person.setAge(ageNumber);

            listt.add(person);
        }

        return listt;
    }

}
