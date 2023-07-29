
public class Solution {
    public int solution(int[] numbers, int n) {
 
         int sum = 0;
        for (int number : numbers) {   //numbers 배열의 앞에서부터 원소를 더해가면서 합이 n보다 커지는 순간까지 더해야 함
            sum += number;
            if (sum > n) {
                break; // 합이 n을 초과하는 순간 반복문을 종료.
            }
        }
        return sum;   //더했던 원소들의 합을 반환해야 함
    }
}
