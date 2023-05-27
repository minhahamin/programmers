public class Solution {
    public static String solution(String myString, String pat) {
      for (int i = myString.length() - 1; i >= 0; i--) {
            if (myString.substring(i).startsWith(pat)) {
                //startsWith 를 사용하여 해당부분 문자열이 pat으로 시작하는 지 확인함
                return myString.substring(0, i + pat.length());
            }
        }
        return myString;
    }


}

