class Solution {
    public int solution(String my_string, String target) {
        if(my_string.contains(target)){ //문자열에서 연속된 일부분이 포함이 되면
            return 1;    //1을 반환
        }
        else {
            return 0;    //아니면 0 반환
        }
    }
}