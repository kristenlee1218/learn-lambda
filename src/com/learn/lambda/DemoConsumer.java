package com.learn.lambda;

import java.util.function.Consumer;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class DemoConsumer {
    public static void main(String[] args) {
        // 调用默认方法
        consumerString(System.out::println);
        // consumer 接口的组合
        consumerString(
                // toUpperCase()，将字符串转换为大写
                s -> System.out.println(s.toUpperCase()),
                // toLowerCase()，将字符串转换为小写
                s -> System.out.println(s.toLowerCase()));
    }

    private static void consumerString(Consumer<String> consumer) {
        consumer.accept("Hello");
    }

    private static void consumerString(Consumer<String> first, Consumer<String> second) {
        first.andThen(second).accept("Hello");
    }
}