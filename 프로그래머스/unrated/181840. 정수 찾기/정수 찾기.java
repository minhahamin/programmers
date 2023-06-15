class Solution {
    public int solution(int[] num_list, int n) {
        for(int num : num_list){  //num_list라는 정수배열과 찾으려는 정수 n을 매개변수로 받음
            if(num == n){      // n과 일치하는 요소가 있다면 1을 반환
                return 1;
            }
        }
        return 0;   //아니라면 0을 반환
    }
}