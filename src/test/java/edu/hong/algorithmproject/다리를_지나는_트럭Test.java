package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 다리를_지나는_트럭Test {

    @Test
    void test1() {
        Assertions.assertEquals(
                8,
                new 다리를_지나는_트럭().solution(2, 10, new int[] {7,4,5,6} )
        );
    }

    @Test
    void test2() {
        Assertions.assertEquals(
                101,
                new 다리를_지나는_트럭().solution(100, 100, new int[] {10} )
        );
    }

    @Test
    void test3() {
        Assertions.assertEquals(
                110,
                new 다리를_지나는_트럭().solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10} )
        );
    }
}
