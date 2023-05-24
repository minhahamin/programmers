class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        boolean foundFirst = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (!foundFirst) {
                    start = i;
                    foundFirst = true;
                }
                end = i;
            }
        }
        
        if (start == -1) {
            return new int[]{-1};
        }
        
        int[] result = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index++] = arr[i];
        }
        
        return result;
    }
}
