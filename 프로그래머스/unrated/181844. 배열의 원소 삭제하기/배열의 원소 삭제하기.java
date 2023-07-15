import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();

        // arr의 각 원소에 대해 반복
        for (int num : arr) {
            boolean shouldDelete = false;

            // delete_list에 있는지 확인
            for (int deleteNum : delete_list) {
                if (num == deleteNum) {
                    shouldDelete = true;
                    break;
                }
            }

            // 삭제해야 할 원소가 아닌 경우 결과 리스트에 추가
            if (!shouldDelete) {
                result.add(num);
            }
        }

        // 결과 리스트를 정수 배열로 변환하여 반환
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}