package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 양과_늑대Test {
    @Test
    void test() {
        Assertions.assertEquals(5,
                new 양과_늑대().solution(
                        new int[]{0,0,1,1,1,0,1,0,1,0,1,1},
                        new int[][] {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}}
                ));
    }

    @Test
    void test2() {
        Assertions.assertEquals(5,
                new 양과_늑대().solution(
                        new int[]{0,1,0,1,1,0,1,0,0,1,0},
                        new int[][] {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6},{3,7},{4,8},{6,9},{9,10}}
                ));
    }


}
