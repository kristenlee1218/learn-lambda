package com.learn.lambda;

import java.util.stream.Stream;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test12 {
    public static void main(String... s) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7).reduce(0, (acc, e) -> acc + e);
        System.out.println(sum);
    }
}