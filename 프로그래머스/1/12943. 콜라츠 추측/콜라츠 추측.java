class Solution {
    public int solution(long num) {
         int answer = 0;

        while (num != 1) {
            // 오버플로우 방지
            if (num < 0 || num > Long.MAX_VALUE) {
                answer = -1;
                break;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            answer++;

            // 500번 반복해도 1이 되지 않으면 -1 반환
            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}