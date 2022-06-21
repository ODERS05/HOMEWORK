package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        B();
    }
    static void A(){
        Map<Integer, String> value = new HashMap<>();
        List<Integer> valueList = new ArrayList<>();
        Integer multi = 1;
        value.put(1, "1");
        value.put(2, "12");
        value.put(3, "123");
        value.put(4, "1234");
        value.put(5, "12345");
        value.put(6, "123456");
        value.put(7, "1234567");
        value.put(8, "12345678");
        value.put(9, "123456789");
        value.put(10, "1234567890");

        value.entrySet().stream()
                .filter(x -> x.getKey() > 5)
                .filter(x -> x.getKey() % 3 == 0)
                .peek(x -> valueList.add(x.getKey()))
                .forEach(System.out::println);

        for (Integer integer: valueList) {
            multi *= integer;
        }

        System.out.println(multi);
    }
    static void B(){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(100) + 1);
        }
        System.out.println(integers);
        List<Integer> tempList = new ArrayList<>();
        integers.stream()
                .map(x -> {
                    if (x % 2 != 0) {
                        tempList.add(x + 10);
                        return -1;
                    } else {
                        return x;
                    }
                })
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println(tempList);
    }
}
