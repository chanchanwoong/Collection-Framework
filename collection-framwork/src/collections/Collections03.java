package collections;

import java.util.*;

public class Collections03 {

    public static void main(String[] args) {
        String[] s = {"황금을", "돌", "같이","보라"};
        List<String> list = Arrays.asList(s);

        // 이진탐색을 위해 정렬 진행
        Collections.sort(list);
        System.out.println(list);

        int i = Collections.binarySearch(list, "황금을");
        System.out.println(i);

        i = Collections.binarySearch(list, "돌");
        System.out.println(i);

        i = Collections.binarySearch(list, "같이");
        System.out.println(i);

        i = Collections.binarySearch(list, "보라");
        System.out.println(i);
    }
}
