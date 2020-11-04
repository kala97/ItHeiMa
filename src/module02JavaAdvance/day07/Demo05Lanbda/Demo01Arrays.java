package module02JavaAdvance.day07.Demo05Lanbda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("liuyan",38),
                new Person("dilireba",18),
                new Person("gilinaza",19)
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()- o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
