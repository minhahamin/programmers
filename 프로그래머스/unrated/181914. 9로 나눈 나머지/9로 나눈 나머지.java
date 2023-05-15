class Solution {
    public static int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        return sum % 9;
    }

    public static void main(String[] args) {
        String number = "12345";
        int remainder = solution(number);
        System.out.println("숫자 : " + number);
        System.out.println("9로 나눈 나머지 : " + remainder);
    }
}
