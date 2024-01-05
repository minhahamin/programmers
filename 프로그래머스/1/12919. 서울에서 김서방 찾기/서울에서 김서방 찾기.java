class Solution {
    public String solution(String[] seoul) {
         for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return ""; // "Kim"은 항상 배열에 존재한다고 가정.
    }
}