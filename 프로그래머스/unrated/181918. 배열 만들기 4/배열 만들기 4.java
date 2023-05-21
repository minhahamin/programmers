import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        //arraylist를 이용하여 새로운 배열 stk 를 구현함
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;  //i변수를 사용하여

        //arr 배열을 순회하며 조건에 따라 stk 배열을 업데이트함
        while (i < arr.length) {
            if (stk.isEmpty() || stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        //마지막으로 arraylist인 stk를 int[] 타입 배열로 변환하여 반환함
        int[] result = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            result[j] = stk.get(j);
        }

        return result;
    }
}
