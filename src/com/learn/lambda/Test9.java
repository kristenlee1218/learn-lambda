package com.learn.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Kristen
 * @date : 2022/4/9
 * @description :
 */
public class Test9 {
    public static void main(String... s) {
        List<String> nameA = Arrays.asList("Mahela", "Sanga", "Dilshan");
        List<String> nameB = Arrays.asList("Misbah", "Afridi", "Shehzad");
        List<List<String>> nameSets = Arrays.asList(nameA, nameB);
        List<String> flatMapList = nameSets.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}