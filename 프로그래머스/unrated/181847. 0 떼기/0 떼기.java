class Solution {
    public String solution(String n_str) {
        int index = 0;

        // 문자열 n_str에서 가장 왼쪽에 처음으로 등장하는 0의 인덱스를 찾음
        while (index < n_str.length() && n_str.charAt(index) == '0') {
            index++;
        }

        // 찾은 인덱스부터 문자열 끝까지의 부분 문자열을 반환
        return n_str.substring(index);
    }
}