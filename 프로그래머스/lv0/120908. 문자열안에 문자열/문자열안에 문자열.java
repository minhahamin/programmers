class Solution {
    public int solution(String str1, String str2) {
        if(str1.contains(str2)){
            return 1;  // str1 안에 str2가 포함되어 있음
        }
        else return 2;  // str1 안에 str2가 포함되어 있지 않음
    }
}