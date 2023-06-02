import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = null;
        try{
            
            BigInteger num1 = new BigInteger(a);        //무한대 정수 다루기 -> biginteger 사용
            BigInteger num2 = new BigInteger(b);
            //long num2 = Long.parseLong(b);        //long 을 사용해도 범위가 초과하는 경우 -> biginteger 사용
            BigInteger sum = num1.add(num2);        //더하기
            answer = sum.toString();                //정수를 문자열로 변환해서 출력하기
           
        }
        catch(NumberFormatException e){
            //숫자형식 예외처리
        }
        catch(Exception e){
            //예외처리
        }        
        return answer;          //답 출력
    }
}