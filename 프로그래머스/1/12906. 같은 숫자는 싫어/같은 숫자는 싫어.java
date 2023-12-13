import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int previousNum = -1; // 초기값을 -1로 설정하여 첫 번째 숫자와 비교 가능하게 함

        for (int num : arr) {
            if (num != previousNum) {
                tempList.add(num);
                previousNum = num;
            }
        }

        // ArrayList를 int[] 배열로 변환
        int[] result = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }

        return result;
    }
}