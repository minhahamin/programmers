import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 부서별 신청 금액을 오름차순으로 정렬
        int count = 0; // 지원할 수 있는 부서의 수

        for(int i = 0; i < d.length; i++) {
            budget -= d[i]; // 예산에서 해당 부서의 신청 금액 차감
            if(budget < 0) break; // 예산이 부족하면 반복 중단
            count++; // 예산이 충분하면 부서 수 증가
        }

        return count; // 지원 가능한 최대 부서 수 반환
    }
}