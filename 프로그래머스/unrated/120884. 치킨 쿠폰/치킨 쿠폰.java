class Solution {
    public int solution(int chicken) {
         int coupons = chicken; // 처음에 주문한 치킨 수만큼 쿠폰을 받음
        int totalFreeChickens = 0; // 서비스로 받은 치킨의 수

        while (coupons >= 10) {
            int freeChickens = coupons / 10; // 10장의 쿠폰으로 교환할 수 있는 치킨 수
            totalFreeChickens += freeChickens; // 서비스 치킨 수 추가
            coupons = coupons % 10 + freeChickens; // 남은 쿠폰 수 계산 (교환 후 남은 쿠폰 + 새로 받은 치킨의 쿠폰)
        }

        return totalFreeChickens;
    }
}