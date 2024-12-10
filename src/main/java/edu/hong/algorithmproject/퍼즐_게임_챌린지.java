package edu.hong.algorithmproject;


public class 퍼즐_게임_챌린지 {

    public static int solution(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = 100000;
        int answer = max;

        while (min <= max) {
            int level = (min + max) / 2;
            if (canSolveWithinLimit(diffs, times, limit, level)) {
                answer = level;
                max = level - 1;
            } else {
                min = level + 1;
            }
        }
        return answer;
    }

    private static boolean canSolveWithinLimit(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] <= level) {
                totalTime += times[i];
            } else {
                int mistakeCount = diffs[i] - level;
                int timeForMistakes = mistakeCount * (times[i] + (i > 0 ? times[i - 1] : 0));
                totalTime += timeForMistakes + times[i];
            }

            if (totalTime > limit) {
                return false;
            }
        }

        return true;
    }

}
