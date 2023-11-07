class Solution {
    public int[][] solution(int[] num_list, int n) {
       // 2차원 배열의 크기는 num_list의 길이를 n으로 나눈 것과 같음.
        int totalRows = num_list.length / n;
        int[][] result = new int[totalRows][n];
        
        // num_list의 각 요소를 올바른 위치에 넣음.
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j];
            }
        }
        
        // 결과 2차원 배열을 반환.
        return result;
    }
}