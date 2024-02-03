import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // 배열 A와 B를 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        int len = A.length;

        // 배열 A의 가장 작은 값과 배열 B의 가장 큰 값을 순서대로 곱하여 더함
        for (int i = 0; i < len; i++) {
            answer += A[i] * B[len - i - 1];
        }

        return answer;
    }
}