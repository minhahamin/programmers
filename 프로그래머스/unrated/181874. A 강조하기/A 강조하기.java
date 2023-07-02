class Solution {
    public static String solution(String myString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'a' || c == 'A') {
                result.append("A");
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
    }
