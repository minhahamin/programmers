import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
      // 빈 배열을 생성
        ArrayList<Integer> X = new ArrayList<>();

        // arr 배열의 원소를 순차적으로 탐색하여 X에 해당 원소를 a번 추가
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                X.add(a);
            }
        }

        // ArrayList를 int 배열로 변환하여 반환
        int[] result = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            result[i] = X.get(i);
        }

        return result;
    }
}