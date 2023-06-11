class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        for(int num : array ){    //array 배열에 있는 정수 원소들을 num으로 대체
            if(num == n){         //num 과 배열에 있는 정수 원소들 n 이 같으면
                cnt++;            //갯수 증가
            }
        }
        return cnt;
    }
}