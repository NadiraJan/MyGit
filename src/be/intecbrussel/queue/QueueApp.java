package be.intecbrussel.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

      //  Queue<BurgerOrder> order = new LinkedList<>();
        Queue<BurgerOrder> order = new PriorityQueue<>();

        order.add(new BurgerOrder("Curry", 4));
        order.add(new BurgerOrder("Curry", 4));
        order.add(new BurgerOrder("Zalm", 2));
        order.add(new BurgerOrder("Chicken", 1));
        order.add(new BurgerOrder("Fries", 1));
        while (order.size() > 0) {
            System.out.println(order.poll());
        }
        order.forEach(System.out::println);
        System.out.println("-------");
    }
}
//RESULT: BurgerOrder{name='Chicken', number=1}
//BurgerOrder{name='Fries', number=1}
//BurgerOrder{name='Zalm', number=2}
//BurgerOrder{name='Curry', number=4}

