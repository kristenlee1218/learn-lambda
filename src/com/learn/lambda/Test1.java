package com.learn.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test1 {
    public static void main(String... s) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int counter = 0;
        for (Integer integer : numbers) {
            if (integer > 5) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}