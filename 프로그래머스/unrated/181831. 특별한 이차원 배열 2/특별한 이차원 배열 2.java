class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;     // 대칭되는 원소가 같지 않으면 0 반환
                }
            }
        }
        return 1;    // 모든 대칭되는 원소가 같다면 1반환
    }
}