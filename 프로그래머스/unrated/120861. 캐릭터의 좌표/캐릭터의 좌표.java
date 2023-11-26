class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // solution 함수는 keyinput과 board를 매개변수로 받음
        // 캐릭터의 현재 위치를 나타내는 x와 y를 0으로 초기화
        // board의 가로 및 세로 크기의 절반을 계산하여 캐릭터가 이동할 수 있는 최대 범위를 결정
        // keyinput 배열을 순회하며 각 키에 따라 캐릭터의 위치를 업데이트합니다. 이때, 캐릭터가 맵의 크기를 벗어나지 않도록 범위 확인
        // 최종적으로 캐릭터의 위치를 배열로 반환
        int x = 0, y = 0;
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y < yLimit) y++;
                    break;
                case "down":
                    if (y > -yLimit) y--;
                    break;
                case "left":
                    if (x > -xLimit) x--;
                    break;
                case "right":
                    if (x < xLimit) x++;
                    break;
            }
        }

        return new int[]{x, y};
    }
}