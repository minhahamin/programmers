class Solution {
    public int solution(int n) {
        //각 사람이 최소 1조각은 먹어야 하므로, n 사람에게 주어져야 할 최소 피자 조각 수는 n 조각
        int multiplier = 1;

        //각 사람이 2조각씩 먹을 경우 필요한 피자 조각 수는 2n 조각이고, 3조각씩 먹을 경우는 3n 조각이 필요
        //이렇게 증가하면서 피자 조각의 총 개수가 6의 배수가 될 때까지 반복, 
        while (true) {
            if ((n * multiplier) % 6 == 0) {
                return (n * multiplier) / 6; //6의 배수가 되는 순간 해당 숫자를 6으로 나눈 값이 필요한 피자의 판수가 됨
            }
            multiplier++;
        }
    }
    }
