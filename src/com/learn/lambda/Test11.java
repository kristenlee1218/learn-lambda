package com.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test11 {
    public static void main(String... s) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7);
        Integer max = numbers.stream().max(Comparator.comparing(k -> k)).get();
        Integer min = numbers.stream().min(Comparator.comparing(k -> k)).get();
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}