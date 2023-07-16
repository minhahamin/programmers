class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        for (int[] query : queries) { // 쿼리 명령 반복
            int start = query[0];
            int end = query[1];
            while (start < end) { // start와 end가 만날 때까지 반복
                // start와 end 위치의 문자를 교환
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(charArray); // 문자 배열을 문자열로 변환하여 반환
    }
}
