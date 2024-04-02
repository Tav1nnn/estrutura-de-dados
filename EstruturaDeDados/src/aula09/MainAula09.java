package aula09;

import java.util.LinkedList;
import java.util.Queue;

public class MainAula09 {
    public static void main(String[] args) {
        /*ex01*/
        Queue<Integer> queue1 = new LinkedList<>();

        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(4);
        queue1.offer(5);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        /*ex02*/
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);

        System.out.println(queue2.contains(3));
    }
}
