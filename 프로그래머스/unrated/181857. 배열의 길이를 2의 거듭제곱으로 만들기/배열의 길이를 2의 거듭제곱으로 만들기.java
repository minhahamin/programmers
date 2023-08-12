class Solution {
    public int[] solution(int[] arr) {
        int originalLength = arr.length;
        int newLength = 1;
        
        // 새로운 배열의 길이 계산
        while (newLength < originalLength) {
            newLength *= 2;
        }
        
        // 새로운 배열 생성 및 복사
        int[] newArr = new int[newLength];
        System.arraycopy(arr, 0, newArr, 0, originalLength);
        
        return newArr;
    }
}