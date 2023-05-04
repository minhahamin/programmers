class Solution {
    public long solution(int n) {
        long sum =0; //0으로 초기화합니다
        
        if ( n %2 ==0) { // 짝수인 경우
            for(int i=2; i<=n; i+=2){
                sum+=i*i;  //i의 제곱을 합에 더합니다
            }
    }
    else {
        for(int i=1; i<= n;i+=2){ //n이 홀수인 경우
            sum+=i;  //i를 sum 에 더합니다
        }
    }
    return sum;
}
}