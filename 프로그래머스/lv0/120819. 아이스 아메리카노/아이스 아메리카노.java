class Solution {
    public int[] solution(int money) {
        
        int americano = 5500; //아메리카노 가격
        int ame_cnt = 0; //아메리카노 최대 마실 수 있는 잔 수
        
    
            if(money >= americano){
                ame_cnt = money / americano;   //돈 / 아메리카노 가격 = 최대 잔 수
                money %= americano; //아메리카노 사고 남은 잔돈
             }
            int[] answer = {ame_cnt, money};
            return answer;
        }
    }
