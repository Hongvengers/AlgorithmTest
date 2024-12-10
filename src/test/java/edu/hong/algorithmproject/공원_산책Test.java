package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 공원_산책Test {
    @Test
    void test1() {
        Assertions.assertArrayEquals(
                new int[] {2,1},
                new 공원_산책().solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2","S 2","W 1"})
        );
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(
                new int[] {0,1},
                new 공원_산책().solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"})
        );
    }

    @Test
    void test3() {
        Assertions.assertArrayEquals(
                new int[] {0,0},
                new 공원_산책().solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"})
        );
    }
}
