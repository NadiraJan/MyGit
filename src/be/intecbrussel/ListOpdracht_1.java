package be.intecbrussel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListOpdracht_1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your words ");
        List<String> words = new ArrayList<>();
        while (true){
            String word = kbd.nextLine();
            words.add(word + " ");
            if(word.endsWith(".")){
                break;
            }
        }
        words.forEach(System.out::print);;
       System.out.println(words.get(words.size()-1));
      /* for(int i=0; i< words.size(); i++) {
            System.out.println(words.get(i));*/
        }

    }
