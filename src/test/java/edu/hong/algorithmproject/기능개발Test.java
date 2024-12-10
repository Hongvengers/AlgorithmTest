package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 기능개발Test {

    @Test
    void test() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = {2, 1};
        Assertions.assertArrayEquals(new 기능개발().solution(progresses,speeds), result);
    }

    @Test
    void test2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] result = {1, 3, 2};
        Assertions.assertArrayEquals(new 기능개발().solution(progresses,speeds), result);
    }
}
