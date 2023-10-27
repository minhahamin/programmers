class Solution {
    public int solution(int order) {
        int count = 0;
        String num = Integer.toString(order);
        for(int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        return count;
    }
}