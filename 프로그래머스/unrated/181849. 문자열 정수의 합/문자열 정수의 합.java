class Solution {
    public int solution(String num_str) {
       int sum = 0;
        for (int i = 0; i < num_str.length(); i++) { //i는 0부터 num_str의 길이 미만까지 증가
            int digit = Character.getNumericValue(num_str.charAt(i));  //num_str.charAt(i)를 사용하여 현재 인덱스에 해당하는 문자를 가져옴
            //Character.getNumericValue 메서드를 사용하여 해당 문자를 정수 값으로 변환

            sum += digit;   //변환된 숫자 값을 digit 변수에 저장
        }
        return sum; // sum 변수에 digit 값을 더함
                    //sum 값을 반환
    }
}