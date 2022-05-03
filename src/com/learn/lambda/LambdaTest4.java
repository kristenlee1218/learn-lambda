package com.learn.lambda;

import java.util.function.BinaryOperator;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class LambdaTest4 {
    public static void main(String[] args) {
        // int delta = -1;
        BinaryOperator<Integer> add = (delta, y) -> delta + y + delta;
        add.apply(1, 2);
    }
}