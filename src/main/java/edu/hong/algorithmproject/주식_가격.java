package edu.hong.algorithmproject;

import java.util.ArrayDeque;
import java.util.Deque;

public class 주식_가격 {
    public int[] solution(int[] prices) {
        int totalTime = prices.length;
        int[] answer = new int[totalTime];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < totalTime; i++) {
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                int last = deque.pollLast();
                answer[last] = i - last;
            }
            deque.offerLast(i);
        }

        while (!deque.isEmpty()) { // 잔반처리
            int last = deque.pollLast();
            answer[last] = totalTime - last - 1;
        }

        return answer;
    }
}
