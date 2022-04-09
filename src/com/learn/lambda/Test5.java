package com.learn.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test5 {
    public static void main(String... s) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        String maxChar = collected.stream().max(String::compareTo).get();
        System.out.println(maxChar);
    }
}