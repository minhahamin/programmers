import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", 0);
        wordToNumber.put("one", 1);
        wordToNumber.put("two", 2);
        wordToNumber.put("three", 3);
        wordToNumber.put("four", 4);
        wordToNumber.put("five", 5);
        wordToNumber.put("six", 6);
        wordToNumber.put("seven", 7);
        wordToNumber.put("eight", 8);
        wordToNumber.put("nine", 9);

        StringBuilder answer = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // 숫자인 경우
                answer.append(ch);
            } else {
                // 영단어인 경우
                currentWord.append(ch);

                // 현재까지의 문자열이 영단어에 해당하는지 확인
                if (wordToNumber.containsKey(currentWord.toString())) {
                    answer.append(wordToNumber.get(currentWord.toString()));
                    currentWord = new StringBuilder();
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}