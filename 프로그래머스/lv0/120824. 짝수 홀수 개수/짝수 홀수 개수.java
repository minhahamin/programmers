class Solution {
    public int[] solution(int[] num_list) {
        int evenCnt = 0;  //짝수 개수
        int oddCnt = 0;  //홀수 개수
        
        for(int i = 0; i < num_list.length; i++){  //num_list의 원소를 반복하면서 
            if(num_list[i] % 2 == 0){
                evenCnt ++;      //짝수 개수 세고
            }
            else if(num_list[i] % 2 != 0){
                oddCnt ++;     //홀수 개수 세고
            }
     
        }  
        int result[] = {evenCnt, oddCnt};     //짝수 개수, 홀수 개수를 담은 result를배열 생성
        return result;   //result 배열 반환
        
    }
}