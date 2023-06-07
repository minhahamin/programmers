import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 결과를 저장할 배열

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0]; // query의 시작 인덱스
            int end = queries[i][1]; // query의 끝 인덱스
            int k = queries[i][2]; // query의 조건 값
            int min = Integer.MAX_VALUE; // 최소값을 저장할 변수

            for (int j = start; j <= end; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j]; // 조건을 만족하는 최소값 업데이트
                }
            }

            if (min == Integer.MAX_VALUE) {
                answer[i] = -1; // 조건을 만족하는 값이 없는 경우
            } else {
                answer[i] = min; // 최소값 저장
            }
        }

        return answer;
    }
}
