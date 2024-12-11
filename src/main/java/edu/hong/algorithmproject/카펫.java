package edu.hong.algorithmproject;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[]{};
        int total = brown + yellow;
        // 가로, 세로 최소 3, 3
        for (int width = 3; width <= total; width++) {
            if (total % width == 0) {
                int height = total / width;

                if (2 * width + 2 * (height - 2) == brown
                        && width >= height) {
                    return new int[]{width, height};
                }
            }
        }
        return answer;
    }
    public int[] deprecated_solution(int brown, int yellow) {
        // -근-의공식
        // ax^2 + bx + c = 0 형태일 때.
        // x = -b abs(sqrt(b^2 - 4ac))

        // brown 공식 및 전개해보기
        // brown + yellow = width * height
        // brown = width * 2  + (height - 2) * 2
        // brown = 2 * width + 2 * hieght - 4
        // brown + 4 = 2 * (width + height)

        // 둘레 공식 활용하기
        // (width + height) * 2 = 둘레(brown + 4)
        // width + height = (brown + 4) / 2
        // height = (brown + 4) / 2 - width

        // 정리
        // width * height = brown + yellow
        // width * ((brown + 4) / 2 - width) = brown + yellow
        // width * (brown + 4 ) / 2 - width^2 = brown + yellow
        // width^2 - (brown + 4) / 2 * width + brown + yellow = 0

        // -근- 대입하기
        // ax^2 + bx + c = 0
        int a = 1;
        int b = -((brown + 4) / 2);
        int c = brown + yellow;

        // x = -b +- sqrt(b^2 - 4ac)
        double formula = Math.sqrt((b * b - 4 * a * c));
        int width = (int) ((-b + formula) / (2 * a));
        int height = c / width;

        return new int[] {width, height};
    }
}
