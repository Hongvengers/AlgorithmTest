package edu.hong.algorithmproject;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;
        for (long i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}
