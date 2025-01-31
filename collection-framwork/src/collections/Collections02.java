package collections;

import java.util.*;

public class Collections02 {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        for (char c = 'A'; c <= 'G'; c++) {
            list.add(c);
        }

        System.out.println("최초 리스트 : " + list);

        Collections.rotate(list, 1);    // 오른쪽으로 1번 쉬프트
        System.out.println("돌린 리스트 : " + list);

        Collections.rotate(list, 2);    // 오른쪽으로 2번 쉬프트
        System.out.println("돌린 리스트 : " + list);

        Collections.rotate(list, 3);    // 오른쪽으로 3번 쉬프트
        System.out.println("돌린 리스트 : " + list);

        Collections.shuffle(list);  // 무작위로 섞는다.
        System.out.println("섞은 리스트 : " + list);
        Collections.shuffle(list);
        System.out.println("섞은 리스트 : " + list);
    }
}
