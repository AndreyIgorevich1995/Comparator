import java.util.Comparator;

public class PersonsSurnames implements Comparator<Person> {
    int maxLenght;

    public PersonsSurnames(int maxLenght) {
        this.maxLenght = maxLenght;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] words1 = o1.getSurname().split("(?U)\\W");
        String[] words2 = o2.getSurname().split("(?U)\\W");
        if (words1.length > maxLenght && words2.length > maxLenght) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else
            return Integer.compare(words1.length, words2.length);
    }
}
