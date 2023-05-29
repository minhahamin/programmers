import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        //정수를 담을 수 있는 리스트로 초기화함
        List<Integer> numbers = new ArrayList<>();
        
        //my_string.toCharArray()를 이용하여 my_string 문자열을 문자 배열로 변환하고 각 문자를 순회하면서 숫자인지 확인함
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){   //현재 문자가 숫자인지 검사하고, 숫자인경우, 
                numbers.add(Character.getNumericValue(c));      //getnumericvalue를 사용하여 해당 문자를 정수로 변환하여 numbers에 추가함
            }
        }
        //모든 숫자를 추가한 뒤, 넘버즈 리스트를 오름차순으로 정렬함
        Collections.sort(numbers);
        
        //반환 값인 answer 배열을 생성하고, 리스트 값을 순서대로 answer배열에 복사함
        int[] answer = new int[numbers.size()];
        for(int i = 0; i<numbers.size(); i++){
            answer[i] = numbers.get(i);
            
        }
        //answer 배열을 반환
        return answer;
    }
}