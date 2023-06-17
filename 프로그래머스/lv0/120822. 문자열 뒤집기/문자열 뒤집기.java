class Solution {
    public String solution(String my_string) {
        
        //Stringbuilder 는 가변적인 문자열을 다룰 때 유용한 클래스
        StringBuilder reverse = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0; i--)  //문자열을 거꾸로 뒤집는 for문
        {
            reverse.append(my_string.charAt(i));   
        }
        return reverse.toString();   //tostring 메서드 사용 -> stringbuilder 를 문자열로 반환
    }
}