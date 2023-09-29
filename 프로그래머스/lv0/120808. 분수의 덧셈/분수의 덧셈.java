class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = lcm(denom1, denom2); // 두 분모의 최소공배수를 구함
        numer1 = numer1 * (lcm / denom1);
        numer2 = numer2 * (lcm / denom2);
        
        int sumNumer = numer1 + numer2;
        
        int gcd = gcd(sumNumer, lcm); // 더한 분수의 분자와 분모의 최대공약수를 구함
        
        return new int[]{sumNumer / gcd, lcm / gcd}; // 기약 분수로 변환
    }

    // 최대공약수 구하기
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수 구하기
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}

