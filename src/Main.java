import java.util.*;

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
        Comparator<Person> comparator = (Person o1, Person o2) ->
        {
            int maxLenght = 3;
            String[] words1 = o1.getSurname().split("(?U)\\W");
            String[] words2 = o2.getSurname().split("(?U)\\W");
            if (words1.length > maxLenght && words2.length > maxLenght)
                return Integer.compare(o2.getAge(), o1.getAge());
            else if (words1.length == words2.length) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return Integer.compare(words1.length, words2.length);
        };

        Collections.sort(people, comparator);
        System.out.println(people.toString());
    }
}