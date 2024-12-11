package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 카펫Test {
    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{4, 3}, new 카펫().solution(10,2));
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(new int[]{3, 3}, new 카펫().solution(8,1));
    }

    @Test
    void test3() {
        Assertions.assertArrayEquals(new int[]{8, 6}, new 카펫().solution(24,24));
    }
}
