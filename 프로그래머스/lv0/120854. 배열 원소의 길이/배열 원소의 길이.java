class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];   //주어진 문자열 배열 길이와 같은 크기를 가지는 정수배열 answer를 생성
        for(int i = 0; i < strlist.length; i++){  
            answer[i] = strlist[i].length();     //i에 해당하는 문자열 길이를 계산하여 answer 배열의 인덱스 i에 저장함
        }
        return answer;      //반복문이 끝나면 모든 문자열 길이가 answer 배열에 저장되고 answer 배열이 반환됨
    }
}