package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 둘만의_암호Test {
    @Test
    void test() {
        Assertions.assertEquals("happy", new 둘만의_암호().solution("aukks", "wbqd", 5));
    }

    @Test
    void test2() {
        Assertions.assertEquals("c", new 둘만의_암호().solution("y", "baz", 1));
    }

    @Test
    void test3() {
        Assertions.assertEquals("cdefghijklmnopqrstuvwxyzb", new 둘만의_암호().solution("bcdefghijklmnopqrstuvwxyz", "a", 1));
    }

    @Test
    void test4() {
        Assertions.assertEquals("n", new 둘만의_암호().solution("z", "abcdefghij", 20));
    }
}
