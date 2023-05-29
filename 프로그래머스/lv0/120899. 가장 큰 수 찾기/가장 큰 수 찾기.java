class Solution {
    public int[] solution(int[] array) {
      int max = Integer.MIN_VALUE;  //min_value 로 설정해서 배열의 원소와 비교하면서 최대값을 갱신함
      int maxIndex = 0;     //최대값이 있는 인덱스를 기록함
     
      for(int i = 0; i < array.length; i++){        //array 배열을 순회하면서 가장 큰 수와 그 수의 인덱스를 찾음
          if(array[i] > max){
              max = array[i];
              maxIndex = i;
          }
      }
        int[] result = {max, maxIndex};
        return result;
        
    }
}