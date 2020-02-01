package examJanuary.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 5 == 0) {
                hashSet.add(numbers.get(i));
            }
        }
        System.out.println(hashSet);
        System.out.println("не до концапонял тему");
    }
}
