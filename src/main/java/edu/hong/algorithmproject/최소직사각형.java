package edu.hong.algorithmproject;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < sizes.length; i++) {
            int tempMax = Math.max(sizes[i][0], sizes[i][1]);
            int tempMin = Math.min(sizes[i][0], sizes[i][1]);
            if (max < tempMax) {
                max = tempMax;
            }
            if (min < tempMin) {
                min = tempMin;
            }
        }
        return max * min;
    }
}
