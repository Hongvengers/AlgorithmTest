package edu.hong.algorithmproject;

import java.util.*;

public class 양과_늑대 {
    int sheepBox; // 검증된 양 여기다 모으자

    public int solution(int[] info, int[][] edges) {
        Map<Integer, List<Integer>> treeMap = new HashMap<>();
        for (int[] edge : edges) {
            treeMap.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }


        sheepBox = 0;
        List<Integer> list = new ArrayList<>();
        dfs(info, 0, 0, 0, list, treeMap);

        return sheepBox;
    }

    private void dfs(int[] info, int index, int sheep, int wolf, List<Integer> indexes, Map<Integer, List<Integer>> treeMap) {

        if (info[index] == 0) {
            sheep++;
        } else {
            wolf++;
        }

        if (sheep <= wolf) {
            return;
        }

        sheepBox = Math.max(sheepBox, sheep);

        List<Integer> nextIndexes = new ArrayList<>(indexes);
        nextIndexes.remove(Integer.valueOf(index));
        if (treeMap.containsKey(index)) {
            nextIndexes.addAll(treeMap.get(index));
        }

        for (int nextIndex : nextIndexes) {
            dfs(info, nextIndex, sheep, wolf, new ArrayList<>(nextIndexes), treeMap);
        }
    }
}
