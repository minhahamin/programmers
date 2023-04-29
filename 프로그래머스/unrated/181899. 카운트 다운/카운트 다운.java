import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int start, int end) {   //int 배열을 list 로 변환
        List<Integer> result = new ArrayList<>(); 

        for (int i = start; i >= end; i--) {
            result.add(i);
        }

        return result;
    }
}
