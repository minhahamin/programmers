import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        // int[]을 ArrayList<Integer>로 변환합니다.
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }

        // 가장 작은 5개의 수를 저장할 리스트를 생성합니다.
        ArrayList<Integer> result = new ArrayList<>();

        // num_list를 오름차순으로 정렬합니다.
        Arrays.sort(num_list);

        // num_list에서 가장 작은 5개의 수를 result 리스트에 추가합니다.
        for (int i = 0; i < 5; i++) {
            result.add(num_list[i]);
        }

        return result;
    }
}
