class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);

        // 기약분수로 만듦
        b /= gcd;

        // 분모를 2와 5로만 나눌 수 있는지 확인
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;
    }

    // 최대공약수를 구하는 함수 (유클리드 알고리즘 사용)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}