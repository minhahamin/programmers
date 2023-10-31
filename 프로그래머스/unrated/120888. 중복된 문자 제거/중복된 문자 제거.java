class Solution {
    public String solution(String my_string) {
       StringBuilder sb = new StringBuilder(); // 문자열 추가를 위한 StringBuilder 사용

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) { // 중복 체크
                sb.append(c);
            }
        }

        return sb.toString();
    }
}