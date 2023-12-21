class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int pointer1 = 0; // cards1의 포인터
        int pointer2 = 0; // cards2의 포인터

        for (String word : goal) {
            boolean foundInCards1 = false;
            boolean foundInCards2 = false;

            // cards1에서 현재 단어를 찾음
            if (pointer1 < cards1.length && cards1[pointer1].equals(word)) {
                pointer1++;
                foundInCards1 = true;
            }

            // cards1에서 단어를 찾지 못하고 cards2에서 현재 단어를 찾음
            if (!foundInCards1 && pointer2 < cards2.length && cards2[pointer2].equals(word)) {
                pointer2++;
                foundInCards2 = true;
            }

            // 어느 카드 뭉치에서도 단어를 찾지 못함
            if (!foundInCards1 && !foundInCards2) {
                return "No";
            }
        }

        return "Yes";
    }
}