class Solution {
    public int[] solution(int[] num_list, int n) {
    
        int[] answer = new int[n] ;  //num_list 요소를 가져와 answer 배열로 저장하여
        int i = 0;
        for(int num : num_list)
        {
           if(i >= n) // i가 n과 크거나 같으면
           {
              break;  //루프 종료
           }
            answer[i++] = num;  //answer 배열 크기를 조정하여 원하는 원소 개수 만큼 
            //요소를 저장하도록 함
            }
        
        
        return answer;   //answer 배열 반환
    }
}