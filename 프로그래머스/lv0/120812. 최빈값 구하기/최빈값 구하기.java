import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
      // 배열의 요소들과 해당 요소들이 나타난 빈도수를 저장하는 Map을 생성합니다.
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열을 순회하며 요소들의 빈도수를 계산하여 frequencyMap에 저장합니다.
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 최빈값과 해당 빈도수를 저장할 변수를 초기화합니다.
        int mode = -1; // 최빈값
        int maxFrequency = 0; // 최빈값의 빈도수

        // frequencyMap을 순회하며 최빈값과 빈도수를 찾습니다.
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mode = num;
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                // 최빈값이 여러 개인 경우 -1을 반환합니다.
                mode = -1;
            }
        }

        return mode;
        }
    }
