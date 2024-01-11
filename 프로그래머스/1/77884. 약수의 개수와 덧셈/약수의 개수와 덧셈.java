class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수의 개수를 계산
            int count = countDivisors(i);

            // 약수의 개수가 짝수이면 더하고, 홀수이면 뺌
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
    // 주어진 숫자의 약수 개수를 계산하는 메소드
    private int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // i와 number/i 는 서로 다른 약수
                if (number / i == i) {
                    // i와 number/i 가 같다면 하나만 카운트
                    count++;
                } else {
                    // 다르면 두 개 모두 카운트
                    count += 2;
                }
            }
        }
        return count;
}
}