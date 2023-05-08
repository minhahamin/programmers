class Solution {
    public String solution(String my_string, int m, int c) {
       StringBuilder result = new StringBuilder();
        
        //mystring 에서 c번째 열에 해당하는 문자를 빌더에 추가.
        //인덱스 i를 c-1로 초기화하고 i가 my_string 길이를 넘지 않을 때까지 i를 m만큼 증가시키며 빌더에 mystring 의 i번째 글자를 추가함
        for(int i=c-1; i<my_string.length(); i+=m){
            result.append(my_string.charAt(i));
            
        }
        return result.toString();
    }
}