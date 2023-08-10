class Solution {
    public int solution(int[] num_list) {
        int totalOperations = 0;
        
        //num_list에 대해 각 정수마다 필요한 나누기 연산 횟수를 계산하고,
        for (int num : num_list) {
            int operations = 0;
            
            while (num > 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                    num /= 2;
                }
                operations++;
            }
            // 모든 정수에 대한 횟수를
            totalOperations += operations;
        }
        // 더한 값을 반환
        return totalOperations;
    }
}
