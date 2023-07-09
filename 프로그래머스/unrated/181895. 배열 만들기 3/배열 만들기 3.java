class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int start1 = intervals[0][0];   //start1 첫번째구간 시작 값
        int end1 = intervals[0][1];     //end1 첫번째구간 끝 값
        int start2 = intervals[1][0];   //start2 두번째구간 시작값
        int end2 = intervals[1][1];     //end2 두번째구간 끝 값

        int[] result = new int[(end1 - start1 + 1) + (end2 - start2 + 1)];    //첫번째 구간 길이와 두번째 구간 길이를 더한 값

        int index = 0;
        for (int i = start1; i <= end1; i++) {   //반복문 사용, 첫번째 구간 값을 result배열에 저장함
            result[index] = arr[i];   //result[index] 에 arr 배열의 해당 위치값 저장하고
            index++;      //index를 증가시킴
        }

        for (int i = start2; i <= end2; i++) {    //두번째 구간도 동일작업 수행 
            result[index] = arr[i];     //두번째 구간 값을 result배열에 저장하고 
            index++;   //index를 증가 시킴
        }

        return result;    //반복문이 종료되면 result 배열 반환
        }
}