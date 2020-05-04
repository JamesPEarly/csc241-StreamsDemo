package csc241;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Kahlo", "Frida", 1907, 7, 6));
        people.add(new Person("Hopper", "Edward", 1882, 7, 22));
        people.add(new Person("Picasso", "Pablo", 1881, 10, 25));
        people.add(new Person("Warhol", "Andy", 1928, 8, 6));
        people.add(new Person("Lichtenstein", "Roy", 1923, 10, 27));
        people.add(new Person("Pollack", "Jackson", 1912, 1, 28));
        people.add(new Person("Dali", "Salvador", 1904, 5, 11));
        people.add(new Person("Johns", "Jasper", 1930, 5, 15));


        Stream<Person> personStream = people.stream();
        personStream
                .filter(p -> p.getBirthday().getMonth().equals(Month.OCTOBER))
                .sorted()
                .forEach(p -> System.out.println(p));
    }
}
