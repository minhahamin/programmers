class Solution {
    public int solution(String binomial) {
           String[] parts = binomial.split(" ");   //이항식을 공백을 기준으로 분리
        int a = Integer.parseInt(parts[0]);
        char op = parts[1].charAt(0);
        int b = Integer.parseInt(parts[2]);

        int result = 0;
        //연산자에 따라 적절한 연산을 수행하여 결과를 반환
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            //주어진 연산자에 대해서만 유효하며, 다른 문자열 또는 형식이 주어질 경우 IllegalArgumentException을 발생
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }

        return result;
    }
}