package part9.Task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person =new Person();
        List list =new ArrayList<>();
        CreatePerson person1 =new CreatePerson();

        List list1 = person1.create(list);

        Vivod vivod = new Vivod();

        vivod.getSomething(list1);

    }

    public static class Vivod{

        public void getSomething(List<Person> list){

           list.stream()
                   .filter(Objects::nonNull)
                   .filter(getAge->getAge<21)
                   .forEach(System.out::println)
                   .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                   .limit(4)
                   .filter(Person::getSurname)
                   .collect(Collectors.toList());
        }

    }
}
