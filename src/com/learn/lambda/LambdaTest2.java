package com.learn.lambda;

import java.util.function.BinaryOperator;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        int delta = -1;
        BinaryOperator<Integer> add = (x, y) -> x + y + delta;
        Integer apply = add.apply(1, 2);
        System.out.println(apply);
    }
}