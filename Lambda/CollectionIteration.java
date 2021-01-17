package Lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // External Iterator
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using Lambda for each loop");
        // Java 8: Internal Iterator
        // Multi-thread && Parallelism
        people.forEach(System.out::println);
    }
}
