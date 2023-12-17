class Solution {
    public long solution(long n) {
         // 제곱근을 구함
        long sqrt = (long) Math.sqrt(n);

        // 제곱근의 제곱이 n과 같다면 n은 어떤 정수의 제곱
        if (sqrt * sqrt == n) {
            // (sqrt + 1)의 제곱을 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // n이 어떤 정수의 제곱이 아니라면 -1 반환
            return -1;
        }
    }
}