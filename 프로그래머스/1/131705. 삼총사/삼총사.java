class Solution {
    public int solution(int[] number) {
        int count = 0;
        int n = number.length;

        // 모든 가능한 3개의 수의 조합을 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 수의 합이 0이면 삼총사
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}