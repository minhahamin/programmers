class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;  //원소들의 합 변수
        int mul = 1;  //원소들의 곱 변수 초기값 0으로 하면 x, 0은 모든 수를 곱해도 0이기 때문임
        
        for(int i =0 ; i<num_list.length; i++){
            sum+=num_list[i];  
            mul*=num_list[i];
            
        }
        if(sum * sum >mul)
        {
            answer=1;
        }
        return answer;
    }
}