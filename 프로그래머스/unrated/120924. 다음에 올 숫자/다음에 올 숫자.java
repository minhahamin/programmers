class Solution {
    public int solution(int[] common) {
        int length = common.length;

        // 등차수열인지 확인 (두 번째 원소와 첫 번째 원소의 차이가 일정한지)
        if (common[1] - common[0] == common[2] - common[1]) {
            int diff = common[1] - common[0];
            return common[length - 1] + diff;
        } 
        // 등비수열인지 확인 (두 번째 원소를 첫 번째 원소로 나눈 값이 일정한지)
        else {
            int ratio = common[1] / common[0];
            return common[length - 1] * ratio;
        }
    }
}