class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        
        for (char c : rsp.toCharArray()) {
            switch (c) {
                case '2': // 가위
                    result.append('0'); // 바위
                    break;
                case '0': // 바위
                    result.append('5'); // 보
                    break;
                case '5': // 보
                    result.append('2'); // 가위
                    break;
            }
        }
        
        return result.toString();
    }
}