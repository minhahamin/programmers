class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String currentString = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];

            // 해당 범위의 문자열을 추출하고 결과 문자열에 덧붙임.
            result.append(currentString.substring(start, end + 1));
        }

        return result.toString();
    }
}



