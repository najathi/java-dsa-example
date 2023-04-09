package org.najathi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // Queue
        //queues(); // uncomment for see queue example

        linkedLists();
    }

    private static void linkedLists() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Najathi", 25));
        linkedList.add(new Person("Mohamed", 25));
        linkedList.addFirst(new Person("Ahamed", 28));
        linkedList.addLast(new Person("Fathima", 30));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext())
            System.out.println(personListIterator.next());

        System.out.println();
        while (personListIterator.hasPrevious())
            System.out.println(personListIterator.previous());
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Najathi", 25));
        supermarket.add(new Person("Mohamed", 25));
        supermarket.add(new Person("Ahamed", 28));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {}
}
