import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
         ArrayList<String> unfinishedTasks = new ArrayList<>();

        
        //todo_list 배열과 finished 배열을 순회하면서 해당 일의 완료 여부를 확인
        for (int i = 0; i < finished.length; i++) {
            //아직 마치지 못한 일들을 ArrayList인 unfinishedTasks에 추가
            if (!finished[i]) {
                unfinishedTasks.add(todo_list[i]);
            }
        }

         // ArrayList에 담긴 값을 문자열 배열로 변환하여 반환
        String[] result = new String[unfinishedTasks.size()];
        result = unfinishedTasks.toArray(result);

        return result;
    }
}