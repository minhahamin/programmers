class Solution {
    public int solution(String str1, String str2) {
       if(str2.contains(str1)){  //str1이 str2의 부분 문자열이라면 1을 반환
           return 1;
       }
        else{   //아니면 0반환
            return 0;
        }
    }
}