package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 다음_큰_숫자Test {
    @Test
    void test() {
        Assertions.assertEquals(83, new 다음_큰_숫자().solution(78));
    }

    @Test
    void test2() {
        Assertions.assertEquals(23, new 다음_큰_숫자().solution(15));
    }
}
