import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
      List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스에서는 query[i]번 인덱스까지 남기고 뒷부분을 잘라서 버림
                list = list.subList(0, query[i] + 1);
            } else {
                // 홀수 인덱스에서는 query[i]번 인덱스 앞부분을 잘라서 버림
                list = list.subList(query[i], list.size());
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
