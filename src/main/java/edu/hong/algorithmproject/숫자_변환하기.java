package edu.hong.algorithmproject;

import java.util.*;

public class 숫자_변환하기 {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<int[]>();
        Set<Integer> visited = new HashSet<>();
//        List<Integer> visited = new ArrayList<>();
        queue.offer(new int[]{x, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int val = cur[0];
            int count = cur[1];

            if (val == y) {
                return count;
            }
            int[] calcs = {val+n, val*2, val*3};
            for (int calc : calcs) {
                if (calc <= y && !visited.contains(calc)) {
                    visited.add(calc);
                    queue.offer(new int[]{calc, count + 1});
                }
            }
        }
        return -1;
    }
}
