class Solution {
    public int solution(int[] num_list) {
      int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {  //num_list 길이만큼 반복
            if (i % 2 == 0) {   //짝수면
                evenSum += num_list[i];  //num_list 원소 + evenSum을 증가
            } else {
                oddSum += num_list[i];   //아니면 num_list 원소 + oddSum을 증가
            }
        }

        return Math.max(oddSum, evenSum);  
    }
}