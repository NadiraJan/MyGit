package be.intecbrussel.Opdracht4;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Task {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your words: ");

        NavigableSet<String> words = new TreeSet<>();
        while (words.size() < 3) { //3 woorden stoppen
            String word = kbd.next();
            words.add(word);

        }
        words.forEach(System.out::println);
        //2de vraag:
        System.out.println("-----------");

    /*    System.out.println(words.first());
        System.out.println(words.last());*/

     /*   TreeSet<String> words = new TreeSet<>();
        words.add("zeta");
        words.add("aeroflot");
        words.add("temperatuur");
        words.add("jiraf");
        words.add("zeta");

        for (String s : words) {
            System.out.println(s);

        }
        System.out.println("------------");
        words.add("String");
        for (String s : words) {
            System.out.println(s);

        }
        System.out.println("------------");
        words.remove("temperatuur");
        for (String s : words) {
            System.out.println(s);

        }
        System.out.println("------------");
        System.out.println(words.first());
        System.out.println(words.last());

    }*/


    }
}