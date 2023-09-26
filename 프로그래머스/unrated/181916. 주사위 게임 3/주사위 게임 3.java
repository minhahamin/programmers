import java.util.HashMap;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        int[] dices = {a, b, c, d};
        for (int dice : dices) {
            frequency.put(dice, frequency.getOrDefault(dice, 0) + 1);
        }

        if (frequency.size() == 1) {
            return 1111 * a;
        }
        
        if (frequency.containsValue(3)) {
            for (int key : frequency.keySet()) {
                if (frequency.get(key) == 3) {
                    return (10 * key + (a + b + c + d - 3 * key)) * (10 * key + (a + b + c + d - 3 * key));
                }
            }
        }

        if (frequency.containsValue(2) && frequency.size() == 2) {
            int p = 0;
            int q = 0;
            for (int key : frequency.keySet()) {
                if (frequency.get(key) == 2) {
                    if (p == 0) {
                        p = key;
                    } else {
                        q = key;
                    }
                }
            }
            return (p + q) * Math.abs(p - q);
        }

        if (frequency.containsValue(2) && frequency.size() == 3) {
            int doubleNum = 0;
            int singleNum1 = 0;
            int singleNum2 = 0;
            for (int key : frequency.keySet()) {
                if (frequency.get(key) == 2) {
                    doubleNum = key;
                } else {
                    if (singleNum1 == 0) {
                        singleNum1 = key;
                    } else {
                        singleNum2 = key;
                    }
                }
            }
            return singleNum1 * singleNum2;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
