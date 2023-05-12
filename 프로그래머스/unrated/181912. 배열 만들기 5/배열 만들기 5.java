import java.util.ArrayList;

class Solution {
  

public static int[] solution(String[] intStrs, int k, int s, int l) {
    ArrayList<Integer> resultList = new ArrayList<>();
    for (String str : intStrs) {
        int startIndex = s;
        int endIndex = s + l;
        if (endIndex > str.length()) {
            endIndex = str.length();
        }
        String subStr = str.substring(startIndex, endIndex);
        int num = Integer.parseInt(subStr);
        if (num > k) {
            resultList.add(num);
        }
    }
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
        result[i] = resultList.get(i);
    }
    return result;
}

}