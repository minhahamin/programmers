import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        
        //arr 배열과 flag 배열을 순회
        //배열과 리스트 간의 변화를 위해 반복문을 사용함
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i] * 2; j++){
                    //처리 결과를 result 리스트에 저장
                    result.add(arr[i]);
                }
            }
            else {
                //arr[i]의 값에 따라 결과 배열 result에서 원소를 제거하는 작업을 수행
                int removeCount = Math.min(arr[i], result.size());
                
                //선택된 원소 개수만큼 반복문을 실행하여 result 리스트에서 원소를 제거
                for(int j = 0; j < removeCount; j++){
                    result.remove(result.size() - 1);
                }
            }
        }
        //result 리스트의 크기만큼의 정수 배열 ret을 생성
        int[] ret = new int[result.size()];
        
        //result 리스트의 크기만큼 반복하며, 
        for(int i = 0; i < result.size(); i++){
            //각 원소를 result 리스트에서 꺼내어 정수 배열 ret에 저장
            ret[i] = result.get(i);
        }
        //이후 result 리스트를 배열로 변환하여 반환
        return ret;
    }
}