class Solution {
    public int solution(int n) {
         int count = 0;
        int num = 1;

        while (count < n) {
            if (!containsThree(num) && num % 3 != 0) {
                count++;
            }
            if (count != n) {
                num++;
            }
        }

        return num;
    }

    private boolean containsThree(int num) {
        while (num > 0) {
            if (num % 10 == 3) return true;
            num /= 10;
        }
        return false;
    }
    }
