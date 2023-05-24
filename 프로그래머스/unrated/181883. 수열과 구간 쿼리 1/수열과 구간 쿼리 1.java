class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];

        for (int[] query : queries) {
            int start = query[0];  // 현재 쿼리 시작 인덱스 s와 
            int end = query[1]; // 종료 인덱스 e까지 반복하면서 

            for (int i = start; i <= end; i++) {
                arr[i] += 1;   //arr배열의 해당 인덱스 값을 1증가 시킴
            }
        }

        return arr;
    }
}
