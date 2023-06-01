import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
       // int[] result = {};
        for(int i = 1; i <= n; i++){
           if(i % 2 != 0){
            result.add(i);
            } 
        }
        int[] resultArr = new int[result.size()];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = result.get(i);
        }
        
        return resultArr;
    }
}