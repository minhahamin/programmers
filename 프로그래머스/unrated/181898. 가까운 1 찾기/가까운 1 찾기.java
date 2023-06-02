public class Solution {
    public static void solution(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1};      //arr 배열에서
        int idx = 1;                            // idx 이후 등장하는 값이 1인 인덱스를 찾아서 반환하는 함수 
        int result = solution(arr, idx);        
        System.out.println(result); // 출력: 3
    }

    public static int solution(int[] arr, int idx) {
        int minIndex = -1;

        for (int i = idx; i < arr.length; i++) {        //i를 idx부터 시작하여 값을 찾아야 함
            if (arr[i] == 1) {
                minIndex = i;
                break;
            }
        }

        return minIndex;
    }
}

