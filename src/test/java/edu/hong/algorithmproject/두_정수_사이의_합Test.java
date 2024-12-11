package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 두_정수_사이의_합Test {
    @Test
    void test() {
        Assertions.assertEquals(12, new 두_정수_사이의_합().solution(3,5));
    }
    @Test
    void test2() {
        Assertions.assertEquals(3, new 두_정수_사이의_합().solution(3,3));
    }
    @Test
    void test3() {
        Assertions.assertEquals(12, new 두_정수_사이의_합().solution(5,3));
    }
}
