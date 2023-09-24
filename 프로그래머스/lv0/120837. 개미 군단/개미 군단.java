class Solution {
    public int solution(int hp) {
        int numOfGeneral = hp / 5;  // 장군개미의 수를 최대한 많이 사용
        hp %= 5;

        int numOfSoldier = hp / 3;  // 병정개미의 수를 최대한 많이 사용
        hp %= 3;

        int numOfWorker = hp;  // 나머지 체력은 모두 일개미를 사용

        return numOfGeneral + numOfSoldier + numOfWorker;  // 전체 개미의 수를 반환
    }
}