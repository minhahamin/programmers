class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행과 열의 길이
        int rows = arr1.length;
        int cols = arr1[0].length;

        // 결과를 저장할 행렬 초기화
        int[][] answer = new int[rows][cols];

        // 각 행과 열에 대해 덧셈 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 같은 행, 같은 열의 값을 더해 결과 행렬에 저장
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // 결과 반환
        return answer;
    }
}