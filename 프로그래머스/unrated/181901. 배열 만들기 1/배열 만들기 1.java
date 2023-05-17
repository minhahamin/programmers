import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
       int[] answer = new int[n/k];  //배열 크기는 n 이하 정수 중 k 배수 개수로 결정
       for(int i=0; i<answer.length; i++){
           answer[i] = (i+1)*k;  //k 배수를 계산하여 배열에 저장
       }
        return answer;
    }
}