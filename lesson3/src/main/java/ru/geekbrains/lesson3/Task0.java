package ru.geekbrains.lesson3;

import java.util.*;

public class Task0 {
    public static void main(String[] args) {

        /**
         *     Пусть дан LinkedList с несколькими элементами.
         *     Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам
         */

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Original list: " + list);
        System.out.println("Reversed list: " + reversedList);
     }
     
     public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (T element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }
}



