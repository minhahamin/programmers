class Solution {
    public String solution(String phone_number) {
        // 전화번호의 길이
        int len = phone_number.length();

        // 마지막 4자리를 제외한 부분을 '*'로 변경
        String stars = "*".repeat(len - 4);

        // 마지막 4자리를 가져옴
        String lastFourDigits = phone_number.substring(len - 4);

        // 결과 문자열을 반환
        return stars + lastFourDigits;
    }
}