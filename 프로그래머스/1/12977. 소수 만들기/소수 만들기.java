class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;

        // 3개의 수를 골라 더한 모든 경우의 수를 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수 판별 함수 호출
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
     // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}