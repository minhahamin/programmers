class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(String s : arr){
            answer.append(s);   //배열의 원소들을 순서대로 반복하면서 StringBuilder 객체에 append() 메소드를 사용하여 연결함
        }
        return answer.toString();
    }
}