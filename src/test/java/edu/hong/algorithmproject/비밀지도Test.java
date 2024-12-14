package edu.hong.algorithmproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 비밀지도Test {
    @Test
    void test() {
        Assertions.assertArrayEquals(new String[] {"#####","# # #", "### #", "#  ##", "#####"},
                new 비밀지도().solution(5,
                        new int[]{9, 20, 28, 18, 11},
                        new int[]{30, 1, 21, 17, 28})
        );
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(new String[] {"######", "###  #", "##  ##", " #### ", " #####", "### # "},
                new 비밀지도().solution(6,
                        new int[]{46, 33, 33 ,22, 31, 50},
                        new int[]{27 ,56, 19, 14, 14, 10})
        );
    }
}
