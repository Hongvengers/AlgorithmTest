package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 삼총사Test {
    @Test
    void test() {
        Assertions.assertEquals(2, new 삼총사().solution(new int[]{-2, 3, 0, 2, -5}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(5, new 삼총사().solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }

    @Test
    void test3() {
        Assertions.assertEquals(0, new 삼총사().solution(new int[]{-1, 1, -1, 1}));
    }
}
