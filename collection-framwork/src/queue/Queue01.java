package queue;

import java.util.*;

public class Queue01 {

    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();

        System.out.println(q.poll());
        q.offer("사과");
        System.out.println("바나나를 추가할까? " + q.offer("바나나"));

        try {
            q.add("체리");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        System.out.println("헤드 : " + q.peek());

        String head = null;

        try {
            head = q.remove();
            System.out.println(head + " 제거하기");
            System.out.println("새로운 헤드 : " + q.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        head = q.poll();
        System.out.println(head + " 제거하기");
        System.out.println("새로운 헤드 : " + q.peek());

        System.out.println("체리 포함? " + q.contains("체리"));
        System.out.println("사과 포함? " + q.contains("사과"));
    }
}
