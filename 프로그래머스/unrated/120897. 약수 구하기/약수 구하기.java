class Solution {
    public int[] solution(int n) {
        // 약수의 개수를 파악하기 위한 리스트
        java.util.ArrayList<Integer> divisorList = new java.util.ArrayList<>();
        
        // 약수를 찾는다.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }

        // 리스트를 배열로 변환
        int[] answer = new int[divisorList.size()];
        for (int i = 0; i < divisorList.size(); i++) {
            answer[i] = divisorList.get(i);
        }
        
        return answer;
    }
}