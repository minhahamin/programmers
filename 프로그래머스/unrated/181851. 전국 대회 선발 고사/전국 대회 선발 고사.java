import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        //PriorityQueue를 사용하여 참석 가능한 학생들의 번호를 등수에 따라 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> rank[i]));
        
        //우선순위 큐에서 상위 세 명의 학생 번호를 추출
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                pq.offer(i);
            }
        }
        //추출된 세 학생 번호에 따라 10000 × a + 100 × b + c를 계산하여 반환
        int a = pq.poll();
        int b = pq.poll();
        int c = pq.poll();

        return 10000 * a + 100 * b + c;
    }

}
