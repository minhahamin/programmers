class Solution {
    public static String solution(String myString) {
        
        //주어진 문자열을 문자배열로 변환한 후,
        char[] chars = myString.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] <'l'){ //각 문자가 l 보다 작은지 확인하여
                chars[i] = 'l'; //l로 바꾸고
            }
        }
        return new String(chars);    //다시 문자열로 변환하여 반환
    }
}