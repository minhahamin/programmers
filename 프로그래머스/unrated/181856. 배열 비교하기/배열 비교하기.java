class Solution {
    public int solution(int[] arr1, int[] arr2) {
       int sum1 = 0;
       int sum2 = 0;
        //<두 정수 배열의 대소관계를 비교하여 결과를 반환하는 코드>
        for(int num : arr1){
            sum1 += num;
        }
        for(int num : arr2){
            sum2 += num;
        }
        //배열 길이가 다른 경우는 긴 배열을 더 큰 쪽으로 판단
        if(arr1.length > arr2.length){
            return 1;
        }
        else if(arr1.length < arr2.length){
            return -1;
        }
        //두 배열의 합이 같은 경우는 두 배열이 같다고 판단
        else {
            if(sum1 > sum2){
                return 1;
            }
            else if(sum1 < sum2){
                return -1;
            }
            else {
                return 0;
            }
        }
}
}