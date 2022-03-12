package programmer;

import programmer.data.Person;
import programmer.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // reversed() dibalik

        people.add(new Person("Eko"));
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Kurniawan"));

    }
}
