class Solution {
    public int[] solution(int[] numbers, String direction) {
        //numbers 배열을 direction에 따라 회전시킨 결과를 반환
        int len = numbers.length;
        int[] result = new int[len];
        
        if ("right".equals(direction)) {
            result[0] = numbers[len - 1];
            for (int i = 1; i < len; i++) {
                result[i] = numbers[i - 1];
            }
        } 
        else if ("left".equals(direction)) {
            result[len - 1] = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                result[i] = numbers[i + 1];
            }
        }

        return result;
    }
}