class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        /*if(num%n==0){
            
            System.out.println(answer);
        }
        else if(num%n!=0){
            answer/=3;
            System.out.println(answer);
        }
        return answer;
*/
    return (num%n==0) ? 1:0;
    
    }
}