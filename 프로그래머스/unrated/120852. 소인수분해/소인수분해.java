class Solution {
    public int[] solution(int n) {
        //주어진 수 n을 소인수분해하여 그 결과를 int[] 배열에 저장. 먼저 임시 배열 temp를 사용하여 소인수를 저장하고,  
       int[] temp = new int[n];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                temp[count++] = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        //실제 소인수의 개수를 기반으로 최종 배열 factors의 크기를 결정.
        int[] factors = new int[count];
        //그 후, System.arraycopy 메소드를 사용하여 temp에서 factors로 필요한 요소들을 복사
        System.arraycopy(temp, 0, factors, 0, count);

        return factors;
    }
}