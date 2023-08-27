import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        // 배열 대신 스택 이용
        Stack<Integer> stk = new Stack<>();
        
        // 주어진 배열 arr 을 순회하면서 스택 stk을 사용하여 
        for (int i = 0; i < arr.length; i++) {
            // 조건에 따라 원소 추가 or 제거
            // peek => 후입선출, 맨 위에 있는 원소가 가장 최근에 추가된 것, peek 을 이용하여 원소 확인 가능 / 맨 위의 원소를 제거하지 않고 값을 확인만 함
            if (!stk.isEmpty() && stk.peek() == arr[i]) {
            // 맨 위의 원소를 제거하면서 값을 반환
            // ex ) [1, 2, 3] -> 3을 반환하고 스택에서 제거
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        // 스택이 비어있다면 -1을 반환
        if (stk.isEmpty()) {
            return new int[]{-1};
        } 
        // 그렇지 않으면 스택의 내용을 배열로 변환하여 반환
        else {
            int[] result = new int[stk.size()];
            for (int i = stk.size() - 1; i >= 0; i--) {
                result[i] = stk.pop();
            }
            return result;
        }
    }
}


