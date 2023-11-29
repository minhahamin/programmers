import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

class Solution {
    public String solution(String polynomial) {
        Map<Integer, Integer> coefficients = new HashMap<>();

        // 다항식을 공백을 기준으로 항으로 분리합니다.
        String[] terms = polynomial.split(" ");

        for (String term : terms) {
            if (!term.isEmpty()) {
                if (term.equals("+")) {
                    continue;
                } else if (term.endsWith("x")) {
                    int termCoefficient;
                    if (term.equals("x")) {
                        termCoefficient = 1;
                    } else {
                        termCoefficient = Integer.parseInt(term.substring(0, term.length() - 1));
                    }
                    coefficients.put(1, coefficients.getOrDefault(1, 0) + termCoefficient);
                } else {
                    int constant = Integer.parseInt(term);
                    coefficients.put(0, coefficients.getOrDefault(0, 0) + constant);
                }
            }
        }

        // 내림차순으로 지수를 정렬합니다.
        Map<Integer, Integer> sortedCoefficients = new TreeMap<>(Comparator.reverseOrder());
        sortedCoefficients.putAll(coefficients);

        StringBuilder result = new StringBuilder();
        for (int exponent : sortedCoefficients.keySet()) {
            int coefficient = sortedCoefficients.get(exponent);
            if (coefficient != 0) {
                if (result.length() > 0) {
                    result.append(" + ");
                }
                if (exponent == 0) {
                    result.append(coefficient);
                } else if (exponent == 1) {
                    if (coefficient == 1) {
                        result.append("x");
                    } else {
                        result.append(coefficient).append("x");
                    }
                } else {
                    if (coefficient == 1) {
                        result.append("x^").append(exponent);
                    } else {
                        result.append(coefficient).append("x^").append(exponent);
                    }
                }
            }
        }

        return result.toString();
    }
}
