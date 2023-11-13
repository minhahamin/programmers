class Solution {
    public int solution(int[] numbers, int k) {
        int currentIndex = 0; // 시작점은 0번 인덱스 (1번째 사람)

        // k-1번 던지기 (첫 번째 던지기는 이미 1번 사람이 수행)
        for (int i = 0; i < k - 1; i++) {
            // 오른쪽으로 한 명 건너뛰고 다음 사람에게 던짐
            currentIndex = (currentIndex + 2) % numbers.length;
        }

        // k번째로 공을 받는 사람의 번호 반환
        return numbers[currentIndex];
    }
}