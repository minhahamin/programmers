class Solution {
    public int solution(int[] array) {
        
        //countOfSevens 변수를 0으로 초기화하여 7의 개수를 세는 데 사용
        int countOfSevens = 0;

        //주어진 배열 array의 각 요소에 대해 반복
        for (int number : array) {
            //각 숫자를 문자열로 변환
            String numberAsString = String.valueOf(number);
            //변환된 문자열의 각 문자를 확인하여 '7'이 있는지 확인하고, '7'을 찾을 때마다 countOfSevens를 1씩 증가
            for (int i = 0; i < numberAsString.length(); i++) {
                if (numberAsString.charAt(i) == '7') {
                    countOfSevens++;
                }
            }
        }

        //모든 숫자를 확인한 후 countOfSevens를 반환
        return countOfSevens;
    }
}