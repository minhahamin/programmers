class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int index = 0;
        
        //주어진 문자열에서 indexOf 메서드를 통해 패턴을 찾고
        //찾은 위치 다음부터 다시 검색하도록 반복문을 이용함
        while((index = myString.indexOf(pat, index)) != -1){
            cnt++;
            index += 1;
        }
        //등장횟수 반환
        return cnt;
    }
}