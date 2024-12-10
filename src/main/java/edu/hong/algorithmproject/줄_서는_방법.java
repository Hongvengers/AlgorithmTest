package edu.hong.algorithmproject;

import java.util.*;

public class 줄_서는_방법 {
    public long[] factorial(int value) {
        long[] answer = new long[value + 1];
        answer[0] = 1;
        for (int i = 1; i <= value; i++) {
            answer[i] = answer[i - 1] * i;
        }

        return answer;
    }

    public int[] solution(int n, long k) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        long[] factorials = factorial(n);

        int[] answer = new int[n];
        long cursor = k - 1;

        for (int i = 0; i < n; i++) {
            long fact = factorials[n - 1 - i];
            int index = (int)(cursor / fact);
            answer[i] = numbers.get(index);
            numbers.remove(index);
            cursor %= fact;
        }
        return answer;
    }
}
