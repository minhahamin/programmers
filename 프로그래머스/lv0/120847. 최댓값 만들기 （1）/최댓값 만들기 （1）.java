import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        //가장 큰 두 수를 곱한 값을 반환
        int n = numbers.length;
        return numbers[n-1] * numbers[n-2];
    }
}