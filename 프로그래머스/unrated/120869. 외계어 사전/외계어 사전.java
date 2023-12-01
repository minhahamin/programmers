import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> permutations = new HashSet<>();
        generatePermutations("", spell, permutations);

        for (String word : permutations) {
            for (String dictionaryWord : dic) {
                if (word.equals(dictionaryWord)) {
                    return 1;
                }
            }
        }
        
        return 2;
    }

    private void generatePermutations(String prefix, String[] array, Set<String> permutations) {
        int n = array.length;
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                String[] newArray = new String[n - 1];
                System.arraycopy(array, 0, newArray, 0, i);
                System.arraycopy(array, i + 1, newArray, i, n - i - 1);
                generatePermutations(prefix + array[i], newArray, permutations);
            }
        }
    }
}