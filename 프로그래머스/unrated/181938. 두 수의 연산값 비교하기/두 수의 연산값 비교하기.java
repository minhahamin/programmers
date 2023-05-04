class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); 
        // a와 b를 붙인 값을 구합니다.
        int d = 2 * a * b; // 2 * a * b 값을 구합니다.

        if (c == d) { // a ⊕ b와 2 * a * b가 같은 경우, a ⊕ b를 반환합니다.
            return c;
        } else if (c > d) { // a ⊕ b가 2 * a * b보다 큰 경우, a ⊕ b를 반환합니다.
            return c;
        } else { // 2 * a * b가 a ⊕ b보다 큰 경우, 2 * a * b를 반환합니다.
            return d;
        }
    }
}

    
