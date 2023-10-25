class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        //주어진 범위의 각 숫자를 문자열로 변환한 후, 
        for (int num = i; num <= j; num++) {
            char[] numChars = Integer.toString(num).toCharArray();
            
            //각 문자를 순회하면서 주어진 숫자 k와 일치하는지 확인하여 등장 횟수를 세는 방식
            for (char c : numChars) {
                if (c == (char)(k + '0')) {
                    count++;
                }
            }
        }
        
        return count;
    }
}