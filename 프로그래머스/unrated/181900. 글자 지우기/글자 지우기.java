import java.util.*;

class Solution {
    public static String solution(String myString, int[] indices) {
        Arrays.sort(indices);  //인덱스를 오름차순으로 정렬
        
       StringBuilder result = new StringBuilder();
       int indexToRemove = 0;   //지워야 할 인덱스의 위치를 나타내는 변수
        
        
        //문자열 myString에서 주어진 인덱스 배열 indices의 원소에 해당하는 문자를 삭제하고
        for (int i = 0; i < myString.length(); i++) {
            if (indexToRemove < indices.length && i == indices[indexToRemove]) {
                indexToRemove++;
            } else {
                
                result.append(myString.charAt(i));
            }
        }
        //이어 붙인 결과를 반환
        return result.toString();
}
}