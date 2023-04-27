package ru.geekbrains.lesson3;

import java.util.*;

/**
 * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
 * Используйте итератор
 */

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }
        System.out.println(sum);

    }
}
