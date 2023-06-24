class Solution {
    public int solution(int[] array, int height) {
         int count = 0;

        //배열의 각 원소를 머쓱이의 키 height와 비교하여 height보다 큰 경우 count 변수를 증가시킴
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }   //반복문이 끝나면 count 를 반환하여 머쓱이 보다 키가 큰 사람 수를 구함
        }

        return count;
    }
}