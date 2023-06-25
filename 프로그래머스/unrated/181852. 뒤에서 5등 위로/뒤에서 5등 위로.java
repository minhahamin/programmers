import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length);  //copyof 함수로 특정 배열의 원하는 길이만큼 새로운 배열로 복사하는 메소드 함수
        Arrays.sort(answer);   //오름차순 정렬함
        return Arrays.copyOfRange(answer, 5, answer.length);    //복사하고자 하는 배열, 시작위치, 배열크기)반환 
    }
}