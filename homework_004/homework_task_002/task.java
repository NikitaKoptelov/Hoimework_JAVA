//        Задача
//  Реализуйте очередь с помощью LinkedList со следующими методами:
//  enqueue() - помещает элементы в конец очереди,
//  dequeue() - возвращает первый элемент из очереди и удаляет его,
//  first() - возвращает первый элемент из очереди, не удаляя.
//
//      Решение:


import java.util.LinkedList;
import java.util.Queue;
 
public class task {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); 
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println("добавленная очередь в памети - " +queue);

        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
        System.out.println("помещение элементов в конец очереди - "+queue);

        System.out.println("первый элемент - "+queue.element());
        queue.remove();
        System.out.println("после удаления первого элемента - "+queue);

        System.out.println("первый элемент - "+queue.element());
        queue.remove();
        System.out.println("после удаления первого элемента - "+queue);

        
    }
}
