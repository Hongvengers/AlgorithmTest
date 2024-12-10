package edu.hong.algorithmproject;

import java.util.*;

public class 공원_산책 {
    Map<String, int[]> moveDirectionMap = new HashMap<>() {{
        put("N", new int[]{-1, 0});
        put("S", new int[]{1, 0});
        put("W", new int[]{0, -1});
        put("E", new int[]{0, 1});
    }};

    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] start = new int[2];


        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    start = new int[]{i, j};
                }
            }
        }
        for (String route : routes) {
            String[] splitted = route.split(" ");

            int distance = Integer.parseInt(splitted[1]);

            int[] movingValue = moveDirectionMap.get(splitted[0]);
            int movingX = movingValue[0];
            int movingY = movingValue[1];
            int positionX = start[0];
            int positionY = start[1];

            boolean isValidForMove = true;

            for (int i = 0; i < distance; i++) {
                positionX += movingX;
                positionY += movingY;

                if (positionX < 0 || positionX >= park.length || // X좌표 나가리
                        positionY < 0 || positionY >= park[0].length() || // Y좌표 나가리
                        park[positionX].charAt(positionY) == 'X') { // 장@애물 만남
                    isValidForMove = false;
                    break;
                }
            }

            if (isValidForMove) {
                start[0] = positionX;
                start[1] = positionY;
            }
        }

        return start;
    }
}
