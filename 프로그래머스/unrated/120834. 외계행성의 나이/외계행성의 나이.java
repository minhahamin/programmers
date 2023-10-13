class Solution {
    public String solution(int age) {
        // 0부터 9까지 숫자에 대응하는 알파벳을 매핑
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        // 주어진 나이를 문자열로 변환
        String ageStr = String.valueOf(age);
        
        StringBuilder result = new StringBuilder();
        
        // 각 숫자 문자를 해당하는 알파벳으로 대체
        for (int i = 0; i < ageStr.length(); i++) {
            result.append(alphabet[ageStr.charAt(i) - '0']);
        }
        
        return result.toString();
    }
}