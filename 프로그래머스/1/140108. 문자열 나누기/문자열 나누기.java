class Solution {
    public int solution(String s) {
        int count = 0;
        int index = 0;
        while (index < s.length()) {
            char x = s.charAt(index);
            int xCount = 0;
            int otherCount = 0;

            // 문자열을 읽으며 x와 다른 문자의 개수를 센다.
            while (index < s.length() && (xCount == 0 || xCount != otherCount)) {
                if (s.charAt(index) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                index++;
            }

            // 분리된 문자열이 있을 때마다 카운트 증가
            count++;
        }

        return count;
    }
}