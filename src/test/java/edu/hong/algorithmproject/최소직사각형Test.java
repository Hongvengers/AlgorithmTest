package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 최소직사각형Test {
    @Test
    void test() {
        Assertions.assertEquals(4000, new 최소직사각형().solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(120, new 최소직사각형().solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
    }

    @Test
    void test3() {
        Assertions.assertEquals(133, new 최소직사각형().solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}
