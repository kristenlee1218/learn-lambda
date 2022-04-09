package com.learn.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test7 {
    public static void main(String... s) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        String formatted = collected.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(formatted);
    }
}