class Solution {
    public String solution(String my_string, int k) {
        StringBuilder result = new StringBuilder();

        
        //for 루프를 이용하여 k번 반복하며, 각각의 반복에서 my_string을 StringBuilder 인스턴스인 result에 추가. 그리고 생성된 문자열을 문자열 형태로 반환.
        for (int i = 0; i < k; i++) {
            result.append(my_string);
        }

        return result.toString();
    }
}
