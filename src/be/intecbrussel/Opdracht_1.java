package be.intecbrussel;

import javax.swing.*;
import java.util.*;

public class Opdracht_1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < 4) {
            numbers.add(kbd.nextInt());
        }
        System.out.println(numbers);
        //   numbers.forEach(System.out::println);
        kbd.close();

        int average = sumNumbers(numbers) / numbers.size();

        System.out.println("MiddleNumber is: " + average);
    }
    public static  int sumNumbers(ArrayList<Integer>numbers){
        int sum=0;
        for(int i =0; i<numbers.size();i++){
            sum+=numbers.get(i);
        }
        return sum;
    }
}
//RESULT:  6
//6
//6
//6
//[6, 6, 6, 6]
//MiddleNumber is: 6


