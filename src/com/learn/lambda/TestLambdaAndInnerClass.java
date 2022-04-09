package com.learn.lambda;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class TestLambdaAndInnerClass {
    public void test() {
        //匿名类实现
        Runnable innerRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("call run in innerRunnable:\t" + this.getClass());
            }
        };
        //Lambda表达式实现
        Runnable lambdaRunnable = () -> System.out.println("call run in lambdaRunnable:\t" + this.getClass());
        new Thread(innerRunnable).start();
        new Thread(lambdaRunnable).start();
    }

    public static void main(String... s) {
        new TestLambdaAndInnerClass().test();
    }
}