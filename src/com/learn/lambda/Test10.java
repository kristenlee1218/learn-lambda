package com.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test10 {
    public static void main(String... s) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7);
        List<Integer> collected = numbers.stream().filter(e -> e > 5).collect(Collectors.toList());
        System.out.println(collected);
    }
}