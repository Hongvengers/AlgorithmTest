package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 타일링3xNTest {
    @Test
    public void test() {
        Assertions.assertEquals(153, new 타일링3xN().solution(8));
    }
}
