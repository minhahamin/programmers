class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            //첫번째 원소를 -> 뒤에서 첫번째 원소
            //두번째 원소를 -> 뒤에서 두번째 원소
            // . . .  결과 -> 거꾸로 정렬
            answer[i] = num_list[num_list.length-i-1];

        }
        return answer;
    }
}