class Solution {
    public int solution(int a, int b, int c) {
      
    int score = 0;

    // 세 숫자가 모두 다를 경우
    if (a != b && b != c && c != a) {
        score = a + b + c;
    }
    // 두 숫자가 같고 나머지 하나는 다른 경우
    else if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        score = sum * squareSum;
    }
    // 세 숫자가 모두 같은 경우
    else {
        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        int cubeSum = a * a * a + b * b * b + c * c * c;
        score = sum * squareSum * cubeSum;
    }

    return score;
}

    }
