/**
 * @Author tanyacheng
 * @Date 2022/2/23 17:28
 * @Version 1.0
 */
package top.ligongd.collections.compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemos {
    public static void main(String[] args) {
        Person person1 = new Person("Caigen",22);
        Person person2 = new Person("Bill", 23);
        Person person3 = new Person("Alibab", 19);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for(Person person: personList){
            System.out.println(person.getName() + " " + person.getAge());
        }

        Collections.sort(personList);

        for(Person person: personList){
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
