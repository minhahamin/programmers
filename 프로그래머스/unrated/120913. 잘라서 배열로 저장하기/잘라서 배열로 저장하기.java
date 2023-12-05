import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            // `n` 길이만큼 또는 남은 부분 문자열을 추출
            result.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        
        // 리스트를 문자열 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }

    private static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
