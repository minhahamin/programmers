import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
         // s1 배열의 원소들을 Set으로 변환
        //HashSet : 순서대로 입력되지 않고, 일정하게 유지되지 않는게 특징
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        
        int count = 0;
         // s2 배열의 원소들을 확인하면서 s1 배열에 존재하는지 검사
        for (String str : s2) {
            if (set1.contains(str)) {
                count++;
            }
        }
        return count;
    }
}