package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 주식_가격Test {

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{4, 3, 1, 1, 0}, new 주식_가격().solution(new int[]{1,2,3,2,3}));
    }
}
