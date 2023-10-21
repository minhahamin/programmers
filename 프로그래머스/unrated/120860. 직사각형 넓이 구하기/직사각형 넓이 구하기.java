import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        // x, y 좌표값들을 담을 리스트 생성
        List<Integer> xValues = new ArrayList<>();
        List<Integer> yValues = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            xValues.add(dots[i][0]);
            yValues.add(dots[i][1]);
        }

        // x, y 좌표값들을 정렬
        Collections.sort(xValues);
        Collections.sort(yValues);

        // 너비와 높이 계산
        int width = xValues.get(3) - xValues.get(0);
        int height = yValues.get(3) - yValues.get(0);

        return width * height;
    }
}