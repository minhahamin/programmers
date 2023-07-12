class Solution {
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1){   //a와 b가 모두 홀수인 경우
            return a * a + b * b;
        }
        else if(a % 2 == 1 || b % 2 == 1){    //a와 b 중 하나만 홀수인 경우
            return 2 * (a+b);
        }
        else { return Math.abs(a-b); }   //a와 b 모두 홀수가 아닌 경우
        
    }
}