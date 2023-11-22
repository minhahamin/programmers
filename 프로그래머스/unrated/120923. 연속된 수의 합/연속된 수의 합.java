public class Solution {
    public int[] solution(int num, int total) {
          int[] result = new int[num];

        // 연속된 숫자들의 평균을 구함
        int average = total / num;

        // 시작 숫자를 계산합니다. 이 숫자부터 num개의 숫자가 연속
        // num이 홀수인 경우와 짝수인 경우를 나누어 계산
        int startNumber = (num % 2 == 0) ? average - (num / 2 - 1) : average - num / 2;

        // 연속된 숫자들을 결과 배열에 담음
        for (int i = 0; i < num; i++) {
            result[i] = startNumber + i;
        }

        return result;
    }
}
