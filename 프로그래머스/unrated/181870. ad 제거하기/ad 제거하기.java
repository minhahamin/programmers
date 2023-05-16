import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> remainingStrings = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                remainingStrings.add(str);
            }
        }

        return remainingStrings.toArray(new String[0]);
    }
}