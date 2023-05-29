public class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder result = new StringBuilder();     // stringbuilder를 사용하여 문자열을 누적

        for (char c : my_string.toCharArray()) {       //문자열을 누적
            //toLowerCase(c)를 사용하여 현재 문자를 소문자로 변환 뒤
            //alp.charAt(0) 과 비교하여 동일한 지 확인 
            
            if (Character.toLowerCase(c) == alp.charAt(0)) {
                
                result.append(Character.toUpperCase(c));    //동일한 경우, toUpperCase(c)를 사용하여 대문자로 변환한 문자를 result에 추가
            } else {
                result.append(c);
            }
        }

        return result.toString();       //toString 을 호출하여 stringbuilder 내용을 문자열로 변환하여 반환함
    }
}
