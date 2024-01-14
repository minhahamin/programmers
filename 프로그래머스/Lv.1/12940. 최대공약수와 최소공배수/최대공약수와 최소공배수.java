class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m); // 최대공약수 계산
        int lcm = (n * m) / gcd; // 최소공배수 계산

        return new int[] {gcd, lcm};
    }
    // 유클리드 호제법을 사용한 최대공약수 계산 메소드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}