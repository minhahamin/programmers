class Solution {
    public int solution(int n) {
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return n - 1; // 이 부분은 항상 1을 리턴하므로, 필요한 경우에만 사용
    }
}