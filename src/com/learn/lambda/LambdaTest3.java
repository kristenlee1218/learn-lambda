package com.learn.lambda;

import java.util.function.BinaryOperator;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        int delta = -1;
        BinaryOperator<Integer> add = (x, y) -> x + y + delta;
        add.apply(1, 2);
        // delta = 2;
    }
}