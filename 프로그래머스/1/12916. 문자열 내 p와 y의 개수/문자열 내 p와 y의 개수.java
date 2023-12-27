class Solution {
    boolean solution(String s) {
       s = s.toLowerCase(); // 문자열을 소문자로 변환
        
        // 'p'와 'y'의 개수 초기화
        int countP = 0;
        int countY = 0;

        // 문자열 순회 및 문자 카운트
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 'p'와 'y'의 개수 세기:
            // 만약 추출한 문자가 'p'라면 countP의 값을 1 증가
            // 만약 추출한 문자가 'y'라면 countY의 값을 1 증가
            if (c == 'p') countP++;
            if (c == 'y') countY++;
        }

        // 결과 반환: 마지막으로, 'p'와 'y'의 개수가 같으면 true를, 그렇지 않으면 false를 반환.
        // return countP == countY; 구문은 countP와 countY가 같으면 true를, 다르면 false를 반환
        return countP == countY;
    }
}