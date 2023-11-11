class Solution {
    public int solution(int[] array, int n) {
        int closest = array[0]; // 가장 가까운 수를 초기화, 배열의 첫 번째 원소로 시작.
        int minDiff = Math.abs(array[0] - n); // 가장 가까운 수와 n의 차이를 계산.

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); // 현재 원소와 n의 차이를 계산.

            // 차이가 더 작거나 같은데, 현재 원소가 더 작을 경우 업데이트
            if (diff < minDiff || (diff == minDiff && array[i] < closest)) {
                closest = array[i];
                minDiff = diff;
            }
        }

        return closest; // 가장 가까운 수를 반환.
    }
}