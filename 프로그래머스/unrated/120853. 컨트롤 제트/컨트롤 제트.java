import java.util.Stack;

class Solution {
    public int solution(String s) {
        //메소드는 먼저 문자열 s를 공백을 기준으로 분리
        String[] parts = s.split(" ");
        
        //Stack이라는 자료구조를 사용하여 더한 숫자들을 추적
        Stack<Integer> stack = new Stack<>();

        //순회하면서, "Z"가 아닌 부분은 숫자로 변환하여 스택에 추가
        for(String part : parts) {
            //"Z"를 만나면 스택에서 가장 최근에 추가된 숫자를 제거
            if(part.equals("Z")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(part));
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        //모든 처리가 끝나면 스택에 남아있는 숫자를 모두 더하여 최종 합계를 반환
        return sum;
    }
}