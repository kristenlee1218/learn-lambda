package com.learn.lambda;

import java.util.function.Function;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class DemoFunction {
    public static void main(String[] args) {
        doApply(Integer::parseInt);
        doCombine(str -> Integer.parseInt(str) + 10, i -> i *= 10);
    }

    private static void doApply(Function<String, Integer> function) {
        int num = function.apply("10");
        System.out.println(num + 20);
    }

    private static void doCombine(Function<String, Integer> first, Function<Integer, Integer> second) {
        int num = first.andThen(second).apply("10");
        System.out.println(num + 20);
    }
}