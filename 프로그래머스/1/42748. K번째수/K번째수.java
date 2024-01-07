import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];

        // Arrays.copyOfRange를 사용하여 array에서 주어진 범위 (i부터 j)를 복사
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // Arrays.sort를 사용하여 복사된 배열을 정렬
            // 정렬된 배열에서 k번째 요소를 찾아 결과 배열에 저장
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        // 마지막으로, 모든 명령에 대한 결과를 담은 배열을 반환
        return answer;
    }
}