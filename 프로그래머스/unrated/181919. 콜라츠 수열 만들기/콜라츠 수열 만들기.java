import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static List<Integer> solution(int n) {
        List<Integer> collatzSequence = new ArrayList<>();
        collatzSequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            collatzSequence.add(n);
        }

        return collatzSequence;
    }

    public static void main(String[] args) {
        int n = 10;
    
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        
        
        List<Integer> result = solution(n);
        System.out.println(result); // 출력: [10, 5, 16, 8, 4, 2, 1]
    }
}

