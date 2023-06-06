class Solution {
    public int solution(int n) {
        int answer = 0;    //더한 값을 저장할 변수
        for(int i = 0 ; i <= n; i += 2){
            answer += i;   //짝수를 더함
        }
        return answer;
    }
}