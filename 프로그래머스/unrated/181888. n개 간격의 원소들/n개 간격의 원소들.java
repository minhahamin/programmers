import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
       List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {  //첫 번째 원소부터 마지막 원소까지 n개 간격으로 원소들을 선택하여 결과 리스트에 추가한 후
            resultList.add(num_list[i]);   //리스트의 원소들을 배열로 변환하여 반환
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}