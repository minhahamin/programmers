import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        // 양수에서 가장 큰 두 개의 값
        int maxPosProduct = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        // 음수에서 가장 작은 두 개의 값
        int maxNegProduct = numbers[0] * numbers[1];

        return Math.max(maxPosProduct, maxNegProduct);
    }
}