class Solution {
    public boolean solution(int x) {
        // 정수 x를 문자열로 변환하여 각 자릿수의 합을 구하기
        String[] digits = Integer.toString(x).split("");
        int sum = 0;
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        
        // x가 합으로 나누어지는지 확인
        return x % sum == 0;
    }
}