package edu.hong.algorithmproject;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> bridgeQueue = new LinkedList<>();
        int time = 0;
        int truckCount = 0;
        int bridgeWeight = 0;

        while (truckCount < truck_weights.length || !bridgeQueue.isEmpty()) {
            time++;

            if (!bridgeQueue.isEmpty() && time - bridgeQueue.peek()[1] >= bridge_length) {
                bridgeWeight -= bridgeQueue.poll()[0];
            }

            if (truckCount < truck_weights.length &&
                    bridgeWeight + truck_weights[truckCount] <= weight) {
                bridgeQueue.offer(new int[]{truck_weights[truckCount], time});
                bridgeWeight += truck_weights[truckCount];
                truckCount++;
            }
        }
        return time;
    }

}
