package edu.hong.algorithmproject;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int elapsedTime = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            queue.offer(elapsedTime);
        }
        while (!queue.isEmpty()) {
            int index = 1;
            int elapsedTime = queue.poll();

            while (!queue.isEmpty() && queue.peek() <= elapsedTime) {
                index++;
                queue.poll();
            }
            answer.add(index);

        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
