import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 사과 점수를 내림차순으로 정렬
        Integer[] scoreObjects = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreObjects, Collections.reverseOrder());
        int maxProfit = 0;
        int count = 0;

        // 상자를 포장하는 과정
        for (int i = 0; i < scoreObjects.length; i++) {
            if (i % m == 0 && i > 0) {
                maxProfit += scoreObjects[i - 1] * m;
                count++;
            }
        }
        if (scoreObjects.length / m > count) {
            maxProfit += scoreObjects[scoreObjects.length - 1] * m;
        }

        return maxProfit;
    }
}