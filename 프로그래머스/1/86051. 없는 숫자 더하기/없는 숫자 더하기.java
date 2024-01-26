class Solution {
    public int solution(int[] numbers) {
        // 결과를 저장할 변수 초기화
        int result = 0;

        // 0부터 9까지의 숫자에 대해 반복
        for (int i = 0; i <= 9; i++) {
            // 해당 숫자가 numbers 배열에 있는지 여부를 확인하는 변수
            boolean found = false;

            // numbers 배열을 순회하면서 현재 숫자가 있는지 확인
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    // 현재 숫자가 numbers 배열에 있다면 found를 true로 설정하고 반복 종료
                    found = true;
                    break;
                }
            }

            // 현재 숫자가 numbers 배열에 없다면 result에 더함
            if (!found) {
                result += i;
            }
        }

        return result;
    }
}