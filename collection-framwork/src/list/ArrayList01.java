package list;

import java.util.*;

public class ArrayList01 {

    public static void main(String[] args) {
        List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");

        System.out.println("1 >> " + list.indexOf("소나타"));
        System.out.println("2 >> " + list.contains("산타페"));

        List<String> cars1 = new ArrayList<>(list);
        List<String> cars2 = new ArrayList<>(list);

        cars1.add("싼타페");
        cars2.remove("제네시스");
        System.out.println("3 >> " + cars1.containsAll(cars2));

        cars1.removeIf(c -> c.startsWith("소"));
        cars1.replaceAll(s -> "뉴" + s);
        cars1.forEach(s -> System.out.println(s + " "));
        System.out.println();

        cars1.clear();
        System.out.println(cars1.isEmpty());
    }
}
