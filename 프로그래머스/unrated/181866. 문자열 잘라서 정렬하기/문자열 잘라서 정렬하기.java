import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static String[] solution(String myString) {
        ArrayList<String> result = new ArrayList<>();
        
        //myString을 x 기준으로 split하여 잘라낸 후, 배열 arr에 저장
        String[] arr = myString.split("x");

        //배열 arr을 순회하면서 빈 문자열이 아닌 경우에만 result 리스트에 추가
        for (String s : arr) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }
        //result 리스트를 collections.sort 를 사용하여 사전순으로 정렬함
        Collections.sort(result);
        //result 리스트를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}