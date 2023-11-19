class Solution {
    public int solution(String my_string) {
         // 수식을 공백을 기준으로 분리하여 배열에 저장
        String[] parts = my_string.split(" ");
        
        // 초기 값은 첫 번째 숫자
        int result = Integer.parseInt(parts[0]);
        
        // 연산자와 숫자를 차례대로 계산
        for (int i = 1; i < parts.length; i += 2) {
            int num = Integer.parseInt(parts[i+1]);
            if (parts[i].equals("+")) {
                result += num;
            } else if (parts[i].equals("-")) {
                result -= num;
            }
        }
        
        return result;
    }
}