class Solution {
    public String solution(String code) {
        int mode = 0; // 시작 mode는 0
        StringBuilder ret = new StringBuilder(); // 결과를 저장할 문자열 빌더
        
        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            
            // mode가 0일 때
            if (mode == 0) {
                if (ch == '1') {
                    mode = 1; // mode를 1로 변경
                } else if (idx % 2 == 0) {
                    ret.append(ch); // idx가 짝수일 때만 ret에 추가
                }
            }
            // mode가 1일 때
            else {
                if (ch == '1') {
                    mode = 0; // mode를 0으로 변경
                } else if (idx % 2 == 1) {
                    ret.append(ch); // idx가 홀수일 때만 ret에 추가
                }
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString(); // ret가 빈 문자열이면 "EMPTY" 반환, 아니면 ret 반환
    }
}