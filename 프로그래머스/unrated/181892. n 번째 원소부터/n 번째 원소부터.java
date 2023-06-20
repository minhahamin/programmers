class Solution {
    public int[] solution(int[] num_list, int n) {
        //int[] 형식의 num_list와 정수 n을 매개변수로 받음
     int size = num_list.length;
        int[] answer = new int[size - n + 1];  //size - n + 1로 설정하여 n번째 원소부터 마지막 원소까지를 저장
        for (int i = n; i <= size; i++) {  //반복문의 조건을 i <= size로 변경하여 마지막 원소까지 순회
            answer[i - n] = num_list[i - 1];
        }
        return answer;
    }
}