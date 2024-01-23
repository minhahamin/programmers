import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        // 세 수포자의 점수를 저장할 배열
        int[] score = new int[3];

        // 각 수포자들이 찍는 패턴을 배열로 저장
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 정답 배열을 순회하면서 각 수포자의 답과 비교하여 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) {
                score[0]++;
            }
            if (answers[i] == person2[i % person2.length]) {
                score[1]++;
            }
            if (answers[i] == person3[i % person3.length]) {
                score[2]++;
            }
        }

        // 가장 높은 점수 계산
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        // 가장 높은 점수를 받은 수포자들을 저장할 리스트
        ArrayList<Integer> result = new ArrayList<>();

        // 각 수포자의 점수가 최고 점수와 일치하는지 확인하고, 일치하면 리스트에 추가
        if (maxScore == score[0]) {
            result.add(1);
        }
        if (maxScore == score[1]) {
            result.add(2);
        }
        if (maxScore == score[2]) {
            result.add(3);
        }

        // 리스트를 배열로 변환하여 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}