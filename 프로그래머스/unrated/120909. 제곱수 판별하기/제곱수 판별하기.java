class Solution {
    public int solution(int n) {
         double sqrtValue = Math.sqrt(n);  // n의 제곱근을 계산
        if (Math.pow((int) sqrtValue, 2) == n) {  // 제곱근의 정수 부분을 다시 제곱하여 원래의 숫자와 같은지 확인
            return 1;
        } else {
            return 2;
        }
    }
}