import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
       int[] result = new int[num_list.length];

        if (n >= num_list.length) {
            return num_list;  // n이 배열 크기 이상이면 원본 배열 반환
        }

        // n 번째 원소 이후의 원소들을 결과 배열의 처음부터 복사
        for (int i = 0; i < num_list.length - n; i++) {
            result[i] = num_list[i + n];
        }
        
        // n 번째까지의 원소들을 결과 배열의 나머지 부분에 복사
        for (int i = num_list.length - n, j = 0; i < num_list.length; i++, j++) {
            result[i] = num_list[j];
        }

        return result;
    }
}
