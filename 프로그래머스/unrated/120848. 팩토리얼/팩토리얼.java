class Solution {
    public int solution(int n) {
        int i = 1;
        long factorial = 1;

        // factorial이 n을 초과할 때 반복을 멈춤.
        while (factorial * i <= n) {
            factorial *= i;
            i++;
        }

        // 반복문을 벗어나면, i는 n을 초과하는 첫 번째 수이므로, i-1을 반환.
        return i - 1;
    }
}