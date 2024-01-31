class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];

        // 체육복을 잃어버린 학생은 -1, 여벌이 있는 학생은 +1로 표시
        for (int l : lost) {
            students[l - 1]--;
        }

        for (int r : reserve) {
            students[r - 1]++;
        }

        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (students[i] == -1) {
                if (i - 1 >= 0 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i + 1 < n && students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        // 수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int s : students) {
            if (s >= 0) {
                answer++;
            }
        }

        return answer;
    }
}