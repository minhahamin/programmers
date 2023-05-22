class Solution {
    public int solution(int n) {
       int pizza = (int) Math.ceil((double) n / 7); //math.ceil 함수를 쓰면 소수점이하를 올림한 결과를 얻을 수 있음
        return pizza;
    }
}