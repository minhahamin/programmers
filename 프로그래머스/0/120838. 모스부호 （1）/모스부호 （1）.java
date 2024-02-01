import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 주어진 모스부호와 대응되는 알파벳을 담은 Map
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        // 공백을 기준으로 모스 부호를 나눠 배열로 변환
        String[] words = letter.split(" ");

        // 해독된 알파벳을 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 각 모스 부호를 알파벳으로 변환하여 StringBuilder에 추가
        for (String word : words) {
            result.append(morse.get(word));
        }

        // 결과 반환
        return result.toString();
    }
}