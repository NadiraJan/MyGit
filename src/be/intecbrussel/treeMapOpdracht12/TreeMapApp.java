package be.intecbrussel.treeMapOpdracht12;
import java.util.*;

public class TreeMapApp {
    public static void main(String[] args) {

        NavigableMap<String, Person> personMap = new TreeMap<>();

        personMap.put("Jan", new Person("Jan", true, 20));
        personMap.put("Vahni", new Person("Vahni", false, 18));
        personMap.put("Kwame", new Person("Kwame", true, 36));
        personMap.put("Fatiah", new Person("Fatiah", false, 75));
        personMap.put("Seungho", new Person("Seungho", true, 90));
        personMap.put("Liselot", new Person("Liselot", false, 23));

        for (String name: personMap.keySet()){
            System.out.println(personMap.get(name));
        }
        System.out.println("------------");
        System.out.println(personMap.get("Seungho"));
        System.out.println(personMap.firstEntry());
        System.out.println(personMap.lastEntry());
    }
}
/*RESULT:
Person{name='Seungho', male=true, age=90}
Fatiah=Person{name='Fatiah', male=false, age=75}
Vahni=Person{name='Vahni', male=false, age=18}
 */