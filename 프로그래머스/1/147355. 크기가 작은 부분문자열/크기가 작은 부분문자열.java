public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLength = p.length();
        long pValue;

        try {
            pValue = Long.parseLong(p);
        } catch (NumberFormatException e) {
            // p가 유효한 숫자가 아닌 경우, 처리를 중단하고 0을 반환
            return 0;
        }

        for (int i = 0; i <= t.length() - pLength; i++) {
            String sub = t.substring(i, i + pLength);

            try {
                long subValue = Long.parseLong(sub);
                if (subValue <= pValue) {
                    count++;
                }
            } catch (NumberFormatException e) {
                // 부분 문자열이 유효한 숫자가 아닌 경우, 이 부분 문자열을 건너뛰고 계속 진행
                continue;
            }
        }
        return count;
    }
}
