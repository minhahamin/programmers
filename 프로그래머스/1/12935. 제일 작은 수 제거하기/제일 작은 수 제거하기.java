class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우, -1만을 포함하는 배열을 반환
        if (arr.length == 1) return new int[]{-1};

        // 가장 작은 수를 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 결과 배열 초기화 (원래 배열 길이 - 1)
        int[] answer = new int[arr.length - 1];
        int index = 0;

        // 가장 작은 수를 제외하고 배열 복사
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}