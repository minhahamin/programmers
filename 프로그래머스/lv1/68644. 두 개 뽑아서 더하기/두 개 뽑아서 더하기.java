import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {      //이중
            for (int j = i + 1; j < numbers.length; j++) {  //for문을 만들어서 numbers 배열의 서로 다른 인덱스에 있는 두 수를 더하고, 결과가 중복되지 않으면 결과리스트에 추가함
                int sum = numbers[i] + numbers[j];
                if (!result.contains(sum)) {
                    result.add(sum);
                }
            }
        }
        
        int[] answer = new int[result.size()];      //결과로 나온 배열 크기는 numbers 배열의 크기에 따라 다를 수 있으므로, 동적으로 크기 조정되는 list를 사용한느 것이 좋음
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
