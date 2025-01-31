package list;

import java.util.*;

public class ArrayList02 {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            al.add(0, i);
        }
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("ArrayList 처리 시간 : " + duration);    // 386267900

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            ((LinkedList<Integer>) ll).addFirst(i);
        }
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList 처리 시간 : " + duration);   // 2713400

        /*
            ArrayList는 중간에 삽인하는 경우, 원소를 뒤로 다 밀어버려야 해서 LinkedList에 비해 삽입 연산이 느리다.
         */
    }
}
