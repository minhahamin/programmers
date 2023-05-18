import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            // arr[i]와 arr[j]의 값을 서로 바꿈
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 1}, {1, 4}, {2, 3}};
        int[] result = solution(arr, queries);

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }
}
