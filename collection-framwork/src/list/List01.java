package list;

import java.util.*;

public class List01 {

    public static void main(String[] args) {
        String[] alphabet1 = {"A", "B", "C", "D"};

        // 배열을 ArrayList로 변환
        List<String> alphabet2 = Arrays.asList(alphabet1);
        alphabet2.set(1, "Change!");    // 1 인덱스에 "Change!" 원소 교체

        Iterator<String> iterator = alphabet2.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " - ");
        }

        alphabet2.sort((x, y) -> x.length() - y.length());
        System.out.println("\nalphabet2.sort -> " + alphabet2.toString());
        String[] alphabet3 = alphabet2.toArray(new String[0]);

        System.out.println("\n");

        for(String str : alphabet3) {
            System.out.print(str + " - ");
        }

        System.out.println("\n");

        alphabet2.forEach(s -> System.out.print(s + " - "));
    }
}
