package edu.hong.algorithmproject;

import java.util.LinkedList;
import java.util.Queue;

public class 미로_탈출 {
    int[] direction_x = {-1, 1, 0, 0};
    int[] direction_y = {0, 0, -1, 1};

    public int solution(String[] maps) {
        int answer = 0;

        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                char cell = maps[i].charAt(j);
                if (cell == 'S') {
                    start = new int[]{i, j};
                } else if (cell == 'L') {
                    lever = new int[]{i, j};
                } else if (cell == 'E') {
                    exit = new int[]{i, j};
                }
            }
        }

        int distanceToLever = findWay(maps, start, lever);
        int distanceToExit = findWay(maps, lever, exit);

        if (distanceToLever == -1 || distanceToExit == -1) {
            return -1;
        }

        return distanceToLever + distanceToExit;
    }

    private int findWay(String[] maps, int[] start, int[] target) {
        int rows = maps.length;
        int cols = maps[0].length();
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if (x == target[0] && y == target[1]) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int temp_x = x + this.direction_x[i];
                int temp_y = y + this.direction_y[i];

                if (temp_x >= 0 && temp_x < rows && temp_y >= 0 && temp_y < cols
                        && maps[temp_x].charAt(temp_y) != 'X' && !visited[temp_x][temp_y]) {
                    visited[temp_x][temp_y] = true;
                    queue.add(new int[]{temp_x, temp_y, distance + 1});
                }
            }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        String[] maps = new String[] {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
//        System.out.println(solution(maps));
//
//        String[] maps2 = new String[] {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
//        System.out.println(solution(maps2));
//    }
}
