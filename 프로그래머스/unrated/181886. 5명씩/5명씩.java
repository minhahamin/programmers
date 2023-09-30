import java.util.*;

public class Solution {
    public String[] solution(String[] names) {
        //결과를 저장하기 위한 result라는 ArrayList<String> 객체를 생성
        ArrayList<String> result = new ArrayList<>();
        
        //for 반복문을 사용하여 names 배열을 5개씩 증가시키면서 반복
        for (int i = 0; i < names.length; i += 5) {
            //반복문 내에서 현재 인덱스의 이름(즉, 각 그룹의 첫 번째 이름)을 result 리스트에 추가
            result.add(names[i]);
        }
        //반복문이 끝나면 result 리스트를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}


