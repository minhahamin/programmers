import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times); // 오름차순으로 정렬
        
        long minTime = 1; // 최소 시간
        long maxTime = (long) times[times.length - 1] * n; // 최대 시간
        
        long answer = maxTime; // 최소 시간과 최대 시간의 중간값으로 초기화
        
        while (minTime <= maxTime) {
            long midTime = (minTime + maxTime) / 2; // 중간 시간 계산
            
            long totalCount = 0; // midTime 동안 심사를 받을 수 있는 총 사람의 수
            
            for (int i = 0; i < times.length; i++) {
                totalCount += midTime / times[i]; // midTime 동안 심사를 받을 수 있는 사람의 수 누적
            }
            
            if (totalCount >= n) {
                // midTime 동안 심사를 받을 수 있는 사람의 수가 심사를 기다리는 총 사람의 수보다 크거나 같은 경우
                // 더 짧은 시간으로 이분 탐색을 진행
                maxTime = midTime - 1;
                answer = midTime;
            } else {
                // midTime 동안 심사를 받을 수 있는 사람의 수가 심사를 기다리는 총 사람의 수보다 작은 경우
                // 더 긴 시간으로 이분 탐색을 진행
                minTime = midTime + 1;
            }
        }
        
        return answer;
    }
}
