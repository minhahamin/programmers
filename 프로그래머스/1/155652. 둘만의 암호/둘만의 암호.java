class Solution {
    public String solution(String s, String skip, int index) {
        // 문자열 s의 각 문자를 index만큼 이동시키면서 skip에 포함된 문자를 건너뛰어 결과 문자열을 생성
        StringBuilder result = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char ch : s.toCharArray()) {
            int currentIndex = alphabet.indexOf(ch);
            int newIndex = currentIndex;

            for (int i = 0; i < index; i++) {
                newIndex = (newIndex + 1) % 26;
                while (skip.indexOf(alphabet.charAt(newIndex)) != -1) {
                    newIndex = (newIndex + 1) % 26;
                }
            }

            result.append(alphabet.charAt(newIndex));
        }

        return result.toString();
    }
}