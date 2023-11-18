import java.util.*;
class Solution {
    public String solution(String s) {
         // 문자 빈도를 저장할 맵 생성
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // 한 번만 등장하는 문자들을 리스트에 추가
        List<Character> uniqueChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        // 사전 순으로 정렬
        Collections.sort(uniqueChars);

        // 결과 문자열을 구성
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }
}