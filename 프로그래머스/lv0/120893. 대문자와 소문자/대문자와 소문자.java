class Solution {
    public static String solution(String my_string) {
        
        //my string 을 문자 배열로 변환 후
       char[] chars = my_string.toCharArray();
        for(int i = 0; i<chars.length; i++){
            char c = chars[i];
            if(Character.isUpperCase(c)){  //각 문자에 대해 대문자인 경우 소문자로 변환하고
                chars[i] = Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){  //소문자면 대문자로 변경함
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);   //변환된 문자배열을 다시 문자열로 생성하여 반환
    }
}