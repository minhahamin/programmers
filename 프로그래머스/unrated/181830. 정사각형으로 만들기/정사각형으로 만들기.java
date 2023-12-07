class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // 행과 열의 수가 같은 경우, 원본 배열 반환
        if (rows == cols) {
            return arr;
        }

        // 행과 열 중 더 큰 값으로 새로운 배열 크기 결정
        int size = Math.max(rows, cols);
        int[][] result = new int[size][size];

        // 새로운 배열에 값 복사 및 0으로 채우기
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < rows && j < cols) {
                    result[i][j] = arr[i][j];
                } else {
                    result[i][j] = 0;
                }
            }
        }

        return result;
    }
}