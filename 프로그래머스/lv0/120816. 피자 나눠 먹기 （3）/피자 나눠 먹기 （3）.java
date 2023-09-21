class Solution {
    public int solution(int slice, int n) {
         if(n<=slice){
             return 1;
         }
        int pizzas = n / slice;
        if(n % slice > 0){
            pizzas += 1;
        }
        return pizzas;
    }
}
