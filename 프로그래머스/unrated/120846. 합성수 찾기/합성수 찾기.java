class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }
        return count;
    }
     private boolean isComposite(int number) {
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors++;
            }
        }
        // 합성수는 약수가 자기 자신과 1을 포함해서 3개 이상이어야 함.
        return factors > 2;
    }
}