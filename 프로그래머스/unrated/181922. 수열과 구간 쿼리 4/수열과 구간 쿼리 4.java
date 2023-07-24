class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //queries 배열에 대해 반복하면서 
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            //각 query 의 범위 내에서 k의 배수 인덱스를 찾고
            for(int i=s; i <= e; i++){
                if(i % k == 0){
                    arr[i] += 1;  //해당 인덱스의 arr요소에 1을 더해줌
                }
            }
        }
        return arr;   //최종적으로 arr 을 반환
    }
}