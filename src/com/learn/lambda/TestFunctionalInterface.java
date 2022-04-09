package com.learn.lambda;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
interface TestFunctionalInterface {
    // 抽象方法
    public void doTest();

    // java.lang.Object 中的 public 方法
    @Override
    public boolean equals(Object obj);

    @Override
    public String toString();

    // 默认方法
    public default void doDefaultMethod() {
        System.out.println("call dodefaultMethod");
    }

    // 静态方法
    public static void doStaticMethod() {
        System.out.println("call doStaticMethod");
    }

    public static void main(String... s) {
        // 实现抽象方法
        TestFunctionalInterface test = () -> {
            System.out.println("call doTest");
        };
        // 调用抽象方法
        test.doTest();
        // 调用默认方法
        test.doDefaultMethod();
        // 调用静态方法
        TestFunctionalInterface.doStaticMethod();
        // 调用 toString()
        System.out.println(test.toString());
    }
}