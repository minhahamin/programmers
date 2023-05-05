public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string); // 입력받은 문자열을 StringBuilder로 변환
        sb.replace(s, s + overwrite_string.length(), overwrite_string); // s부터 overwrite_string의 길이만큼을 overwrite_string으로 대체
        return sb.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}
