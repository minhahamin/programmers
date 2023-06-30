class Solution {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();  //소문자 변환
        pat = pat.toLowerCase();
        
        int strlength = myString.length();
        int patlength = pat.length();
        
        for(int i = 0; i <= strlength - patlength; i++){
            String substring = myString.substring(i, i + patlength);
            if(substring.equals(pat)){   //연속된 부분 문자열 중 pat 이 존재하면 
                return 1;   //1을 반환
            }
        }
        return 0;   //그렇지 않으면 0 을 반환
    }
    
}