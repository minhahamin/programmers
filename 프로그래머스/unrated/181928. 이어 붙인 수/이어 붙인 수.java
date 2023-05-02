import java.util.ArrayList;

public class Solution {
    public int solution(int[] num_list) {
        
        //각각의 원소가 짝수인지 홀수인지 판별하여 oddList와 evenList라는 두 개의 리스트에 분리
        ArrayList<Integer> oddList = new ArrayList<Integer>(); 
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        
        //각각의 리스트를 for 루프를 이용하여 순서대로 이어 붙인 수의 합을 계산한 후, 
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenList.add(num_list[i]);
            } else {
                oddList.add(num_list[i]);
            }
        }

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < oddList.size(); i++) {
            oddSum = oddSum * 10 + oddList.get(i);
        }

        for (int i = 0; i < evenList.size(); i++) {
            evenSum = evenSum * 10 + evenList.get(i);
        }
        // 이를 더하여 최종 결과를 반환
        return oddSum + evenSum;
    }
}
