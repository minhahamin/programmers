class Solution {
    public static int solution(int num, int k) {
      String numArr = String.valueOf(num);      //입력을 받은 num을 문자열로 변환 후,
      char ch = (char) ('0'+ k);        //k를 문자로 변환하여
        
        for(int i = 0; i<numArr.length(); i++){     //num의 각 자리 수와 비교함   
            if(numArr.charAt(i) == ch){     //k와 일치하는 자릿수를 찾으면 해당 자리 수를 반환함
                return i+1;     //자리 수는 1부터 시작하므로 1을 더해줌
            }
        }
        return -1;      //k가 없는 경우는 -1 반환
    }
}