package ru.geekbrains.lesson3;

import java.util.LinkedList;

/**
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     */

     public class MyQueue<T> {
        private LinkedList<T> queue = new LinkedList<>();
    
        public void enqueue(T element) {
            queue.addLast(element);
        }
    
        public T dequeue() {
            return queue.pollFirst();
        }
    
        public T first() {
            return queue.getFirst();
        }
    
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    
    
        public static void main(String[] args) {
            MyQueue<Integer> queue = new MyQueue<>();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
    
            System.out.println(queue.dequeue());
            System.out.println(queue.first()); 
            
        }
    }
