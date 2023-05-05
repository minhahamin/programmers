class Solution {
    public int solution(int a, int b) {

        String ab = Integer.toString(a) + Integer.toString(b); // a와 b를 문자열로 변환하고 연결
        String ba = Integer.toString(b) + Integer.toString(a); // b와 a를 문자열로 변환하고 연결
        
        int abInt = Integer.parseInt(ab); // 문자열을 정수로 변환
        int baInt = Integer.parseInt(ba);
        
        return abInt >= baInt ? abInt : baInt; // 큰 값을 반환(삼항연산)
    }
}

    

