class Solution {
    public int solution(int n) {
        int cnt = 0;    //순서쌍 개수 변수
        
        for(int i = 1; i <= n; i++){
            //1부터 n 까지 수를 반복하여 순서쌍 찾기
            if(n % i == 0){
                int quoter = n / i;
            // 두 숫자 곱이 n 이 되는 경우
            if(i * quoter == n){
                cnt ++;
            }
            }
        }
        return cnt;    //순서쌍 개수 증가
    }
}