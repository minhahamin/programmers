class Solution {
    public String solution(int[] numLog) {
        int prev = numLog[0];
        StringBuilder result = new StringBuilder();
        for(int i=1; i<numLog.length; i++){
            int diff = numLog[i]-prev;
            if(diff == 1){
                result.append("w");
            }else if(diff==-1){
                result.append("s");
            } else if(diff==10){
                result.append("d");
            } else if(diff ==-10){
                result.append("a");
            }
            prev = numLog[i];
        }
        return result.toString();
    }
}