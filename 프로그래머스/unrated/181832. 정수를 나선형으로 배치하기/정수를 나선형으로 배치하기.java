class Solution {
    public int[][] solution(int n) {
        // 배열 초기화 및 변수 초기화
        int[][] matrix = new int[n][n];
        
        // 배열에 넣을 숫자를 나타내는 변수 -> 초기값 1
        int num = 1; 
        
        // 현재 나선형 범위를 나타내는 변수
        // 처음 배열 전체 범위를 나타내도록 초기화 됨
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        
        
        // 나선형 숫자 채우기
        while(num <= n*n)
        {
            for (int i = left; i <= right; i++){
                // 배열 크기 만큼 반복하면서 나선형으로 숫자를 채움 
                // num 변수를 활용하여 숫자를 하나씩 증가함
                matrix[top][i] = num++;
            }
            top++;
            
            // 우측 열 채우기
            for(int i = top; i <= bottom; i++){
                // 현재 나선형 범위의 우측 열을 숫자로 채움
                matrix[i][right] = num++;
            }
            // 변수를 감소시켜 다음에는 우측 열을 건너뛰도록 설정함
            right--;
            
            
            // 하단행 채우기
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num++;
            }
            // 변수를감소시켜 다음에는 하단 행을 건너뛰도록 설정함 
            bottom--;
            
            // 좌측 열 채우기
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = num++;
            }
            // 변수를 증가시켜 다음에는 좌측 열을 건너뛰도록 설정함
            left++;
        }
        // 결과 반환 : 나선형 숫자가 모두 채워진 배열을 반환
        return matrix;
    }
}