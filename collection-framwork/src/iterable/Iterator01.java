package iterable;

import java.util.*;

/*
    반복자
    -
 */

public class Iterator01 {

    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("첫 번째", "두 번째", "세 번째");


        // iterator 객체를 Collection 객체에서 직접 메서드 호출해서 생성해야 한다.
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " - ");
        }

        System.out.println("\n\n순환 후, 기존 iterator 객체로 순환 시도");

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " - ");
        }

        System.out.println("\n\n새로운 iterator 객체로 순환 시도");

        iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " - ");
        }
    }
}
