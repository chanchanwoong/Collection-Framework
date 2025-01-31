package collections;

import java.util.*;

/*
    Collections 클래스는 일종의 util 클래스이다.
    Collection 프레임워크에서 제공되는 객체들을 정렬, 섞기, 탐색 등이 가능하다.
 */

public class Collections01 {

    public static void main(String[] args) {
        String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
