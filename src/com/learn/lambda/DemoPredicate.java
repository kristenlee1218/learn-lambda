package com.learn.lambda;

import java.util.function.Predicate;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class DemoPredicate {
    public static void main(String[] args) {
        // 条件判断
        doTest(s -> s.length() > 5);
        // 逻辑非
        doNegate(s -> s.length() > 5);
        // 逻辑与
        boolean isValid = doAnd(s -> s.contains("H"), s -> s.contains("w"));
        System.out.println("逻辑与的结果：" + isValid);
        // 逻辑或
        isValid = doOr(s -> s.contains("H"), s -> s.contains("w"));
        System.out.println("逻辑或的结果：" + isValid);
    }

    private static void doTest(Predicate<String> predicate) {
        boolean veryLong = predicate.test("Hello World");
        System.out.println("字符串长度很长吗：" + veryLong);
    }

    private static boolean doAnd(Predicate<String> resource, Predicate<String> target) {
        return resource.and(target).test("Hello world");
    }

    private static boolean doOr(Predicate<String> one, Predicate<String> two) {
        return one.or(two).test("Hello world");
    }

    private static void doNegate(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("Hello World");
        System.out.println("字符串长度很长吗：" + veryLong);
    }
}