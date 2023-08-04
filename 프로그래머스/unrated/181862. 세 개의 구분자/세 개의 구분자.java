import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        //입력 문자열을 반복하면서 
        for (char c : myStr.toCharArray()) {
        //"a", "b", "c" 문자를 구분자로 사용하여 문자열을 나누고, 
            if (c == 'a' || c == 'b' || c == 'c') {
                if (current.length() > 0) {
                   // 각 나눠진 문자열을 리스트에 저장
                    result.add(current.toString());
                    current = new StringBuilder();
                }
            } else {
                current.append(c);
            }
        }

        if (current.length() > 0) {
            result.add(current.toString());
        }
        // 리스트가 비어있는 경우에는 "EMPTY"를 추가
        if (result.isEmpty()) {
            result.add("EMPTY");
        }
        // 마지막으로 결과 리스트를 배열로 변환하여 반환
        return result.toArray(new String[result.size()]);
    }
}