class Solution {
    public static int[] solution(int[] arr, int n) {
        int length = arr.length;
        int[] modify = new int[length];

        for (int i = 0; i < length; i++) {
            if (length % 2 == 0) {  // arr의 길이가 짝수인 경우
                if (i % 2 != 0) {
                    modify[i] = arr[i] + n;
                } else {
                    modify[i] = arr[i];
                }
            } else {  // arr의 길이가 홀수인 경우
                if (i % 2 == 0) {
                    modify[i] = arr[i] + n;
                } else {
                    modify[i] = arr[i];
                }
            }
        }

        return modify;
    }
}