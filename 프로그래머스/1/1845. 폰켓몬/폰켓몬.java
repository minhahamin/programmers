import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        // HashSet을 사용하여 폰켓몬 종류 번호의 중복을 제거
        Set<Integer> uniquePokemons = new HashSet<>();

        // HashSet의 크기와 N/2를 비교하여, 둘 중 작은 값을 반환
        for (int num : nums) {
            uniquePokemons.add(num);
        }

        return Math.min(uniquePokemons.size(), nums.length / 2);
    }
}