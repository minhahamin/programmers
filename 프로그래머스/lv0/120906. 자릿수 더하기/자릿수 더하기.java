class Solution {
    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // n을 10으로 나눈 나머지는 가장 오른쪽 자리 숫자가 됨
            n /= 10; // n을 10으로 나누어 가장 오른쪽 자리 숫자를 없애기
        }
        return sum;
    }
}