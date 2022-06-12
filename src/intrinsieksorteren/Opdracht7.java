package intrinsieksorteren;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Opdracht7 {
    public static void main(String[] args) {
        //Sorteer de personen in de volgorde leeftijd, naam

        Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getLastName).
                thenComparingInt(Person::getAge).thenComparing(Person::getFirstName));

        Person person = new Person("Pearl", "Zola", 31);
        Person person1 = new Person("Anton", "Bertens", 81);
        Person person2 = new Person("William", "De Smet", 22);

        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);

        personSet.forEach(System.out::println);

        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
    }
}
//RESULT:Person{firstName='Anton', lastName='Bertens', age=81}
//Person{firstName='William', lastName='De Smet', age=22}
//Person{firstName='Pearl', lastName='Zola', age=31}
//false
//false