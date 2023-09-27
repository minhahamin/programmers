class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder result = new StringBuilder(); //결과를 저장할 StringBuilder 객체 result를 생성

        for (int i = 0; i < code.length(); i++) {    
            if (i % q == r) {  // 주어진 문자열 code의 각 문자에 대해 해당 문자의 인덱스를 q로 나눈 나머지 값이 r과 같은지 확인
                result.append(code.charAt(i));   //같으면 결과 문자열에 추가
            }
        }

        return result.toString();  //마지막으로 결과 문자열을 반환
    }
}