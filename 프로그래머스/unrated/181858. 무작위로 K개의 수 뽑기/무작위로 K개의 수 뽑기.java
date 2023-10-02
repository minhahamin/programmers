//HashSet을 사용하여 중복되지 않는 숫자들을 추출하였고,
import java.util.HashSet;
//LinkedList를 사용하여 결과 배열을 생성
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] arr, int k) {
        //HashSet을 사용하여 중복된 값을 거르고 순서대로 저장하는데 사용되는 LinkedList에 값을 추가
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> resultList = new LinkedList<>();

        //주어진 배열 arr을 순회하면서 HashSet에 없는 값을 발견할 때마다 LinkedList에 추가
        for (int num : arr) {
            if (!set.contains(num) && resultList.size() < k) {
                set.add(num);
                resultList.add(num);
            }
        }
        //LinkedList의 크기가 k보다 작을 경우, 나머지 부분을 -1로 채움.
        while (resultList.size() < k) {
            resultList.add(-1);
        }
       
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }
        //LinkedList의 값을 결과 배열에 복사하여 반환
        return result;
    }
}