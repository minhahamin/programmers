class Solution {
    public int solution(int number, int limit, int power) {
        // 각 기사에게 필요한 무기의 공격력을 계산하고, 이를 통해 필요한 철의 총량을 더함
        int totalIron = 0;
        for (int i = 1; i <= number; i++) {
            int divisors = countDivisors(i);
            totalIron += (divisors > limit) ? power : divisors;
        }
        return totalIron;
    }

    // countDivisors 메소드를 통해 주어진 숫자의 약수 개수를 계산
    private static int countDivisors(int number) {
        int count = 0;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                count += (number / i == i) ? 1 : 2;
            }
        }
        return count;
    }
    }
