import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isNumberWith05(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private boolean isNumberWith05(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
