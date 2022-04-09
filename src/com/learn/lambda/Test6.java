package com.learn.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test6 {
    public static void main(String... s) {
        List<Integer> collected = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.toList());
        Map<Boolean, List<Integer>> divided = collected.stream().collect(Collectors.partitioningBy(e -> e > 5));
        System.out.println(divided.get(true));
        System.out.println(divided.get(false));
    }
}