import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> filtered = Arrays.stream(arr)
                                       .filter(n -> n % divisor == 0)
                                       .boxed()
                                       .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            return new int[]{-1};
        }

        return filtered.stream().sorted().mapToInt(i -> i).toArray();
    }
}