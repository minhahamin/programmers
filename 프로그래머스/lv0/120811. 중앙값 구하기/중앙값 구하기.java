import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        //배열을 오름차순정렬
        Arrays.sort(array);
        
        int length = array.length;
        int middle = length / 2;
        
        if(length % 2 == 0){  //배열길이가 짝수인 경우 중앙에 위치한 값 반환
            return Math.min(array[middle - 1], array[middle]);
        }else {   //배열 길이가 홀수인 경우 중앙값 반환
            return array[middle];
        }
    }
}