class Solution {
    public int solution(String before, String after) {
         // 두 문자열의 길이가 다르면 재배열이 불가능하므로 0을 반환
        if (before.length() != after.length()) {
            return 0;
        }
        
        // 두 문자열의 문자들을 각각의 배열로 변환
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        // 배열을 정렬
        java.util.Arrays.sort(beforeArr);
        java.util.Arrays.sort(afterArr);
        
        // 정렬된 배열을 문자열로 다시 변환
        String sortedBefore = new String(beforeArr);
        String sortedAfter = new String(afterArr);
        
        // 정렬된 두 문자열이 동일한지 비교
        if (sortedBefore.equals(sortedAfter)) {
            return 1; // 동일하면 재배열이 가능하므로 1 반환
        } else {
            return 0; // 동일하지 않으면 재배열이 불가능하므로 0 반환
        }
    }
}