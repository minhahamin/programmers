import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int lastElement = num_list[length - 1];

        if (lastElement > num_list[length - 2]) {
            int diff = lastElement - num_list[length - 2];
            int[] answer = Arrays.copyOf(num_list, length + 1);
            answer[length] = diff;
            return answer;
        } else {
            int[] answer = Arrays.copyOf(num_list, length + 1);
            answer[length] = lastElement * 2;
            return answer;
        }
    }
}
