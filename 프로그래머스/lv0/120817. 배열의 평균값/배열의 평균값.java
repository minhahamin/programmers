class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        
        //배열 원소 합 계산
        for(int i = 0 ; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;  //평균값 계산
        return average;
    }
}