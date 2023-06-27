class Solution {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 1){    //k가 홀수면 arr 모든 원소에 k 곱함
            for(int i = 0; i < arr.length; i++){ 
                arr[i] *= k;
            }
        }
        else {    // k가 짝수면 모든 원소에 k를 더함
            for(int i = 0; i < arr.length; i++){
                arr[i] += k;
            }
        }
        return arr;
    }
}