class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0; // 단어별 인덱스를 추적

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                index = 0; // 공백을 만나면 인덱스를 초기화
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(c)); // 짝수 인덱스인 경우 대문자로 변환
                } else {
                    sb.append(Character.toLowerCase(c)); // 홀수 인덱스인 경우 소문자로 변환
                }
                index++;
            }
        }

        return sb.toString();
    }
}