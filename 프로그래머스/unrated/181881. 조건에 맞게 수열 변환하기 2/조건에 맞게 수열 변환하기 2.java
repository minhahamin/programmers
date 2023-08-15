class Solution {
    public int solution(int[] arr) {
        int x = 0; // 초기값 설정
        
        while(true){
            boolean equal = true; // 두 배열이 같은지 확인하는 변수
            
            // 배열작업을 반복하여 arr(x) = arr(x+1) 인 x를 찾는 함수
            for(int i = 0; i < arr.length; i++){
                int num = arr[i];
                
                if(num >= 50 && num % 2 == 0){
                    arr[i] = num / 2;
                }else if(num < 50 && num % 2 != 0){
                    arr[i] = num * 2 + 1;
                }
                // 배열이 변경 되었으므로 같은지 확인
                if(arr[i] != num){
                    equal = false;
                }
            }
            if(equal){
                return x;
            }
            x++;
        }
    }
}