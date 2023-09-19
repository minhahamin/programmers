class Solution {
    public static int solution(int n, int k) {
        final int YANGKOCHI_PRICE = 12000;
        final int DRINK_PRICE = 2000;
        int serviceDrinks = n / 10;

        int total_price = (n * YANGKOCHI_PRICE) + (k * DRINK_PRICE) - (serviceDrinks * DRINK_PRICE);

        return total_price;
    }
}