class Solution {
    public int[] solution(int[] arr) {
       int[] result = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){   //50 이상인 짝수일 경우 2로 나눔
                result[i] = arr[i] / 2;
            }
            else if(arr[i] < 50 && arr[i] % 2 == 1) {  //50미만인 홀수일 경우 2로 곱합
                result[i] = arr[i] * 2;
            }
            else {
                result[i] = arr[i];   //그 외 경우 , 그대로 놔둠
            }
        }
        return result;
    }
}