class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 현재 지점이 안전한 지역인 경우
                if (board[i][j] == 0) {
                    int mines = countMines(board, i, j);
                    // 주변에 지뢰가 없으면 안전한 지역으로 처리
                    if (mines == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private static int countMines(int[][] board, int row, int col) {
        int n = board.length;
        int mines = 0;

        // 주변 8방향에 대해 지뢰가 있는지 확인
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int k = 0; k < 8; k++) {
            int nx = row + dx[k];
            int ny = col + dy[k];

            // 범위 내에 있고 지뢰가 있는 경우
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                mines++;
            }
        }

        return mines;
    }
}