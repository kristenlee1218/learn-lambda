package com.learn.lambda;

import java.util.function.Supplier;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class DemoSupplier {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World";
        System.out.println(getString(() -> s1 + s2));
    }

    private static String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get();
    }
}