import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        // 문자열 앞뒤의 공백 제거
        my_string = my_string.trim();

        // 문자열을 공백을 기준으로 분할하여 단어 리스트 생성
        String[] words = my_string.split("\\s+");

        // 단어 리스트를 문자열 배열로 변환
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i];
        }

        return result;
    }
}