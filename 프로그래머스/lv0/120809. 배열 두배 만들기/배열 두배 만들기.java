class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];  //result 배열은 numbers 배열과 같은 길이를 가짐
        for(int i = 0; i<numbers.length; i++){
            result[i] = numbers[i] * 2;  //각 원소를 2배로 반환한 값으로 채워짐
        }
        return result;
    }
}