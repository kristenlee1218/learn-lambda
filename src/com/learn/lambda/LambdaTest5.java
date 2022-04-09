package com.learn.lambda;

import java.util.function.BinaryOperator;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class LambdaTest5 {
    public static int staticNum;
    private int num;

    public void doTest() {
        BinaryOperator<Integer> add1 = (x, y) -> {
            num = 3;
            staticNum = 4;
            return x + y + num + LambdaTest5.staticNum;
        };
        Integer apply = add1.apply(1, 2);
        System.out.println("apply: " + apply);
    }

    public static void main(String[] args) {
        new LambdaTest5().doTest();
    }
}