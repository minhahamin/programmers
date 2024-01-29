import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지의 실패율을 저장할 맵
        Map<Integer, Double> failureRates = new HashMap<>();

        // 각 스테이지별로 실패율 계산 및 맵에 저장
        for (int i = 1; i <= N; i++) {
            int totalUsers = 0; // 현재 스테이지에 도전한 사용자 수
            int unclearedUsers = 0; // 현재 스테이지를 클리어하지 못한 사용자 수

            // 모든 사용자에 대해 현재 스테이지에 도전한 경우를 확인
            for (int stage : stages) {
                if (stage >= i) {
                    totalUsers++;
                    if (stage == i) {
                        unclearedUsers++;
                    }
                }
            }

            // 실패율 계산 및 맵에 저장
            double failureRate = (totalUsers == 0) ? 0 : (double)unclearedUsers / totalUsers;
            failureRates.put(i, failureRate);
        }

        // 실패율을 내림차순으로 정렬하기 위해 리스트로 변환
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failureRates.entrySet());
        // 실패율을 기준으로 내림차순 정렬
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 정렬된 스테이지 번호를 결과 배열에 저장
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}