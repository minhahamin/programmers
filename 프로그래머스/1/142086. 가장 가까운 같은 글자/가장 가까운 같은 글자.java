import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        // HashMap을 사용하여 각 문자가 마지막으로 나타난 위치를 저장
        HashMap<Character, Integer> lastPosition = new HashMap<>();

        
        // 문자가 문자열에서 처음 나타나는 경우 -1을 결과 배열에 저장
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 그렇지 않으면 현재 위치와 마지막 위치의 차이를 저장
            if (lastPosition.containsKey(c)) {
                result[i] = i - lastPosition.get(c);
            } else {
                result[i] = -1;
            }

            lastPosition.put(c, i);
        }

        return result;
    }

 
}
