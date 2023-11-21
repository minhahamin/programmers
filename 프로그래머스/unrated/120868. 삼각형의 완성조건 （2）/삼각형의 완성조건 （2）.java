public class Solution {
    public int solution(int[] sides) {
        // 주어진 두 변의 길이를 a와 b로 설정
        int a = sides[0];
        int b = sides[1];

        // 세 번째 변이 될 수 있는 최소 길이
        int min = Math.abs(a - b) + 1;
        // 세 번째 변이 될 수 있는 최대 길이
        int max = a + b - 1;

        // 가능한 변의 개수 반환
        return max - min + 1;
    }
}

