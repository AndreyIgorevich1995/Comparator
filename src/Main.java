import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("A", "X Y Z", 20),
                new Person("Vasili", "X Y Z G D", 35),
                new Person("Evgeni", "X Y Z G D L", 40),
                new Person("Petr", "X Y", 155),
                new Person("Georg", "X Y", 17),
                new Person("Alex", "X-Y-Z", 22),
                new Person("Sasha", "A", 41),
                new Person("Egor", "A", 15),
                new Person("Julia", "A", 11)
        ));
        Predicate<Person> predicate = x -> x.getAge() < 18;
        people.removeIf(predicate);
        System.out.println(people);

    }
}