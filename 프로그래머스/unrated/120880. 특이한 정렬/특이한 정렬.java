import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numlistInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(numlistInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int diff1 = Math.abs(o1 - n);
                int diff2 = Math.abs(o2 - n);

                // n으로부터의 거리가 같다면 더 큰 수를 앞으로
                if (diff1 == diff2) {
                    return o2 - o1;
                }

                // 그렇지 않으면 가까운 순으로 정렬
                return diff1 - diff2;
            }
        });

        return Arrays.stream(numlistInteger).mapToInt(Integer::intValue).toArray();
    }
}