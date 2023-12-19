import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        // 최소 힙을 사용하여 상위 k개의 점수를 유지
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        int[] result = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() < k) {
                hallOfFame.add(score[i]);
            } else {
                if (score[i] > hallOfFame.peek()) {
                    hallOfFame.poll();
                    hallOfFame.add(score[i]);
                }
            }
            // 명예의 전당의 최하위 점수를 결과 배열에 저장
            result[i] = hallOfFame.peek();
        }
        return result;
    }
}