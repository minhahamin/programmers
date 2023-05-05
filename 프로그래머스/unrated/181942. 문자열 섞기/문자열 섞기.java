class Solution {
    public String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder(); //StringBuilder를 이용해 결과 문자열을 저장할 result를 초기화
        int length = str1.length();
        for (int i = 0; i < length; i++) { 
        //for문을 이용해 i를 0부터 length - 1까지 반복합니다. 반복문 안에서는 result에 str1과 str2에서 i 위치의 문자를 번갈아가며 추가
        result.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return result.toString();
    }
}