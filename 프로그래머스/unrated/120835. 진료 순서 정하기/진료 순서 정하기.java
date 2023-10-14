import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 원본 배열을 복사하여 정렬하기 위한 배열을 생성.
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);
        
        // 응급도를 기준으로 내림차순으로 정렬.
        Arrays.sort(sortedEmergency);
        for (int i = 0; i < emergency.length; i++) {
            int idx = Arrays.binarySearch(sortedEmergency, emergency[i]);
            
            // 정렬된 배열에서 응급도의 위치를 찾아 해당 위치를 결과 배열에 저장.
            answer[i] = emergency.length - idx;
        }
        
        return answer;
    }
}