class Solution {
    public String solution(String my_string, int num1, int num2) {
        //char 배열로 변환하여 두 인덱스의 문자를 서로 교환한 후 
        char[] arr = my_string.toCharArray();

        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        //다시 문자열로 반환하는 방법으로 문제를 해결
        return new String(arr);
    }
}