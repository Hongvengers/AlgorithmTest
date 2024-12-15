package edu.hong.algorithmproject;

import java.util.ArrayList;
import java.util.List;

public class 둘만의_암호 {
    public String solution(String s, String skip, int index) {
        List<Character> alphabets = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alphabets.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int curIndex = alphabets.indexOf(c);
            sb.append(alphabets.get((curIndex + index >= alphabets.size())
                    ? (curIndex + index) % alphabets.size()
                    : curIndex + index));
        }

        return sb.toString();
    }
}
