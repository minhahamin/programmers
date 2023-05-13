import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] suffixes = new String[my_string.length()]; // 모든 접미사를 담을 배열 생성
        for (int i = 0; i < my_string.length(); i++) {
            suffixes[i] = my_string.substring(i); // i번째 인덱스부터 끝까지의 부분 문자열 추출
        }
        Arrays.sort(suffixes); // 사전순으로 정렬
        return suffixes;
    }
}
