package edu.hong.algorithmproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;

public class 같은_숫자는_싫어 {

    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                stack.add(arr[i]);
            }
        }
        answer = stack.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public int[] solution2(int []arr) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                queue.add(arr[i]);
            }
        }
        answer = queue.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
