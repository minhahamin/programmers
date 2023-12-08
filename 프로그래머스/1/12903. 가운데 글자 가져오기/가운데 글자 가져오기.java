class Solution {
    public String solution(String s) {
       int length = s.length();
        
        // 문자열의 길이가 짝수인 경우
        if(length % 2 == 0){
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
        
        // 문자열의 길이가 홀수인 경우
        else{
            return s.substring(length / 2, length / 2 + 1);
        }
    }
}