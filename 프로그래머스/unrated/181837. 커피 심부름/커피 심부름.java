class Solution {
    public int solution(String[] order) {
        int total = 0;

        for (String item : order) {
            switch (item) {
                case "iceamericano":
                case "americanoice":
                case "americano":
                case "anything":
                    total += 4500;
                    break;
                case "hotamericano":
                case "americanohot":
                    total += 4500;
                    break;
                case "icecafelatte":
                case "cafelatteice":
                case "cafelatte":
                    total += 5000;
                    break;
                case "hotcafelatte":
                case "cafelattehot":
                    total += 5000;
                    break;
            }
        }

        return total;
    }
}