package edu.hong.algorithmproject;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            StringBuilder mergedBinary = new StringBuilder();
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    mergedBinary.append("1");
                } else {
                    mergedBinary.append("0");
                }
            }
            String binaryString = mergedBinary.toString();
            binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            answer[i] = binaryString.replace('1', '#').replace('0', ' ');
        }
        return answer;
    }

}
