package com.learn.lambda;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test4 {
    public static void main(String... s) {
        List<String> collected = Stream.of("a", "b", "c", "c").collect(Collectors.toList());
        TreeSet<String> treeSet = new TreeSet<>(collected);
        System.out.println(collected);
        System.out.println(treeSet);
    }
}