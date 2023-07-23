class Solution {
    public String solution(String my_string) {
        //문자열에서 모음을 제거하고 새로운 문자열 생성
        String answer = my_string.replaceAll("[aeiouAEIOU]", "");
        return answer;
    }
}