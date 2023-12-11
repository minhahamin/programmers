import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 먼저 n번째 문자를 기준으로 비교
                if (s1.charAt(n) != s2.charAt(n)) {
                    return s1.charAt(n) - s2.charAt(n);
                } 
                // n번째 문자가 같으면 전체 문자열을 사전순으로 비교
                else {
                    return s1.compareTo(s2);
                }
            }
        });
        return strings;
    }
}