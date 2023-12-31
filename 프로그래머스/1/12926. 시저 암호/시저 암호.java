class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // 소문자 알파벳 처리
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자 알파벳 처리
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            // 공백은 그대로 유지
            sb.append(c);
        }

        return sb.toString();
    }
}