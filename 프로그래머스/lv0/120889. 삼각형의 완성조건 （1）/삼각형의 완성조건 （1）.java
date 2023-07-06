import java.util.Arrays;
class Solution {
 public static int solution(int[] sides) {
        // 변의 길이를 오름차순으로 정렬
        Arrays.sort(sides);

        int maxSide = sides[2];
        int sumOfOtherSides = sides[0] + sides[1];

        if (maxSide < sumOfOtherSides) {
            // 세 변으로 삼각형을 만들 수 있음
            return 1;
        } else {
            // 세 변으로 삼각형을 만들 수 없음
            return 2;
        }
}
}