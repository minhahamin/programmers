import java.util.*;

class Solution {
    public int[] solution(String myString) {
        // 'x' 이외의 연속 문자 시퀀스의 길이를 저장할 이름이 지정된 ArrayList를 생성
        ArrayList<Integer> lengths = new ArrayList<>();
        int count = 0;   //이 변수는 count'x'가 아닌 문자의 현재 연속 시퀀스 길이를 추적하는 데 사용
    
        //입력 문자열의 각 문자를 반복
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {  //루프가 문자 'x'를 만나면 'x'가 아닌 문자의 현재 연속 시퀀스가 종료
                lengths.add(count);  // ArrayList 에 길이를 추가하고 
                count = 0;   //count 0으로 재설정하여 다음 연속 시퀀스의 길이를 계산하기 시작
            } else {
                count++;      // count현재 연속 시퀀스의 길이를 추적하기 위해 변수를 증가
            }
        }
    
        lengths.add(count);        //루프가 종료된 후 마지막 count값을 ArrayList에 추가
    
        int[] result = new int[lengths.size()];    //ArrayList 와 같은 크기로 명명된 정수 배열을 생성
        for (int i = 0; i < lengths.size(); i++) {   //루프 내에서 ArrayList에서 요소를 검색 하고 
            result[i] = lengths.get(i);    //배열 lengths의 해당 인덱스에 할당
        }
    
        return result;   //입력 문자열에서 'x' 이외의 연속 문자 시퀀스의 길이를 포함하는 배열을 반환
    }
}
