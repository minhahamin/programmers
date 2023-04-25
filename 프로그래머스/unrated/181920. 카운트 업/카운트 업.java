import java.util.ArrayList;
import java.util.List;
class Solution {
    public static List<Integer> solution(int start, int end) {
       
        List<Integer> list = new ArrayList<Integer>();
    
        for(int i=start; i <=end; i++){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        int start = 3;
        int end = 10;
        List<Integer> answer = solution(start, end);
        System.out.println(answer);
    }
}