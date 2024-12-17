package edu.hong.algorithmproject;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        int bitCount = Integer.bitCount(n);
        for (int i = n + 1; n <= 1000000; i++) {
            if (bitCount == Integer.bitCount(i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
