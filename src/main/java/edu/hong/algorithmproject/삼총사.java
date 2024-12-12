package edu.hong.algorithmproject;

public class 삼총사 {
    public int solution(int[] number) {
        // 3 ≤ number의 길이 ≤ 13
        // 조합은 (n * (n - 1) * (n - 2)) / 6 이므로
        // (13 * 12 * 11) / 6 = O(286)
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
