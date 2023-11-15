import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] averages = new double[n];
        Integer[] indices = new Integer[n];

        // 각 학생의 평균 점수 계산 및 인덱스 초기화
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
            indices[i] = i;
        }

        // 평균 점수를 기준으로 내림차순 정렬 (인덱스 포함)
        Arrays.sort(indices, Comparator.comparingDouble((Integer i) -> averages[i]).reversed());

        int[] ranks = new int[n];
        int currentRank = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0 && averages[indices[i]] != averages[indices[i - 1]]) {
                currentRank = i + 1;
            }
            ranks[indices[i]] = currentRank;
        }

        return ranks;
    }

  
}
