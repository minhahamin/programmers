class Solution {
    public int solution(int[] box, int n) {
        // 각 차원별로 들어갈 수 있는 주사위의 개수를 계산
        int xDiceCount = box[0] / n;
        int yDiceCount = box[1] / n;
        int zDiceCount = box[2] / n;
        
        // 결과들을 곱하여 주사위의 최대 개수 구하기
        return xDiceCount * yDiceCount * zDiceCount;
    }
}