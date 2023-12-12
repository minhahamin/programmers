class Solution {
    public long solution(int a, int b) {
        
        // Math.min()과 Math.max()를 사용하여 a와 b 사이의 범위를 결정
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // 범위에 속하는 모든 정수를 더하여 answer에 저장
        for (int i = start; i <= end; i++) {
            answer += i;
        }

        // answer를 반환
        return answer;
    }
}