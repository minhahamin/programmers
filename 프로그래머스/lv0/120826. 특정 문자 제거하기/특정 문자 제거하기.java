class Solution {
    public String solution(String my_string, String letter) {
        // StringBuilder 객체는 문자열을 계속해서 덧붙이거나 삭제
       StringBuilder sb = new StringBuilder();
        
        // for를 사용하여 my_string의 각 문자를 순회하면서 
        for(int i = 0; i<my_string.length(); i++){
            String c = String.valueOf(my_string.charAt(i));
            if(!c.equals(letter)){  // letter와 동일하지 않은 문자를
                sb.append(c);   // StringBuilder에 추가
                //StringBuilder에 저장된 문자들을 문자열로 변환하고 이를 반환
            }
        }
        return sb.toString();   // StringBuilder의 내용을 문자열로 변환
    }
    
}