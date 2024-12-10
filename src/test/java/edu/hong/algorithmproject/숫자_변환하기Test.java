package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class 숫자_변환하기Test {

    @Test
    void test1() {
        int x = 10;
        int y = 40;
        int n = 5;
        Assertions.assertEquals(new 숫자_변환하기().solution(x,y,n), 2);
    }

    @Test
    void test2() {
        int x = 10;
        int y = 40;
        int n = 30;
        Assertions.assertEquals(new 숫자_변환하기().solution(x,y,n), 1);
    }

    @Test
    void test3() {
        int x = 2;
        int y = 5;
        int n = 4;
        Assertions.assertEquals(new 숫자_변환하기().solution(x,y,n), -1);
    }
}
