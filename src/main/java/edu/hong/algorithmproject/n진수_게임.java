package edu.hong.algorithmproject;

public class n진수_게임 {
    String nums = "0123456789ABCDEF";

    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;

        while (sb.length() < t * m) {
            sb.append(convert(num++, n));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            result.append(sb.charAt((p - 1) + i * m));
        }

        return result.toString();
    }

    private String convert(int num, int n) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            result.insert(0, nums.charAt(num % n));
            num /= n;
        }

        return result.toString();
    }
}
