class Solution {
    public int solution(int n) {
        // sieve라는 불린 배열을 생성하고, 2부터 n까지 모든 숫자에 대해 true로 설정
       boolean[] sieve = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }

        //2부터 시작하여 n의 제곱근까지 반복. 이미 소수로 표시된 숫자의 모든 배수를 순회하며 소수가 아님을 표시
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        // 2부터 n까지 배열을 순회하며 소수(true로 표시된 숫자)의 개수를 세어 반환
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                count++;
            }
        }

        return count;
    }
}