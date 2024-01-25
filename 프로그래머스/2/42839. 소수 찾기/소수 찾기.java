import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        char[] chars = numbers.toCharArray();
        int[] nums = new int[chars.length];

        // 문자열을 숫자 배열로 변환
        for (int i = 0; i < chars.length; i++) {
            nums[i] = chars[i] - '0';
        }

        Set<Integer> set = new HashSet<>();
        // 가능한 모든 조합 생성
        generatePermutations(nums, 0, set);

        // 소수 개수 세기
        int count = 0;
        for (int num : set) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // 가능한 모든 조합 생성 (순열)
    private void generatePermutations(int[] nums, int index, Set<Integer> set) {
        if (index == nums.length) {
            for (int i = 1; i <= nums.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    sb.append(nums[j]);
                }
                set.add(Integer.parseInt(sb.toString()));
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            generatePermutations(nums, index + 1, set);
            swap(nums, index, i);
        }
    }

    // 두 인덱스의 값을 교환
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 소수 판별
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    
}
