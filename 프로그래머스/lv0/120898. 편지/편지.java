class Solution {
    public int solution(String message) {
        int letterWidth = message.length() * 2;   //편지지 최소 가로 길이를 구하기 위해 문자 수에 2를 곱함
        return letterWidth;   //최소 가로길이 반환
    }
}