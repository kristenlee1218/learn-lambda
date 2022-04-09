package com.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test2 {
    public static void main(String... s) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream1 = numbers.stream();
        numbers.remove(6);
        // 直接使用numbers的stream()
        long counter = numbers.stream().filter(e -> e > 5).count();
        System.out.println(counter);
        // 调用之前的stream1
        counter = stream1.filter(ex -> (Integer) ex > 5).count();
        System.out.println(counter);
    }
}