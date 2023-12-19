import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // N의 마지막 자릿수를 더함
            n /= 10;       // N을 10으로 나누어 다음 자릿수를 준비
        }

        return sum;
    }
}