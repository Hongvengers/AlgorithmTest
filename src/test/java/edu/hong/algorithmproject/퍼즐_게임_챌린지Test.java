package edu.hong.algorithmproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import static org.junit.jupiter.api.Assertions.*;

@TestComponent
public class 퍼즐_게임_챌린지Test {

    @Test
    void test1() {
        int[] diffs1 = {1, 5, 3};
        int[] times1 = {2, 4, 7};
        long limit1 = 30;
        assertEquals(3, 퍼즐_게임_챌린지.solution(diffs1, times1, limit1));

        int[] diffs2 = {1, 4, 4, 2};
        int[] times2 = {6, 3, 8, 2};
        long limit2 = 59;
        assertEquals(2, 퍼즐_게임_챌린지.solution(diffs2, times2, limit2));

        int[] diffs3 = {1, 328, 467, 209, 54};
        int[] times3 = {2, 7, 1, 4, 3};
        long limit3 = 1723;
        assertEquals(294, 퍼즐_게임_챌린지.solution(diffs3, times3, limit3));

        int[] diffs4 = {1, 99999, 100000, 99995};
        int[] times4 = {9999, 9001, 9999, 9001};
        long limit4 = 3456789012L;
        assertEquals(39354, 퍼즐_게임_챌린지.solution(diffs4, times4, limit4));
    }
}
