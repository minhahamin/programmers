class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;

        if (length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}
