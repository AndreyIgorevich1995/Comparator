import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("A", "X Y Z", 20),
                new Person("Vasili", "X Y Z G D", 35),
                new Person("Evgeni", "X Y Z G D L", 40),
                new Person("Petr", "X Y", 155),
                new Person("Georg", "X Y", 17),
                new Person("Alex", "X-Y-Z", 22)
        ));
        Collections.sort(people);
        System.out.println(people.toString());
        Collections.sort(people, new PersonsSurnames(3));
        System.out.println(people.toString());
    }
}