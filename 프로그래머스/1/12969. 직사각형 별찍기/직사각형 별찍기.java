import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n과 m 입력받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 제한 조건 체크
        if (n > 1000 || m > 1000) {
            System.out.println("n과 m은 각각 1000 이하인 자연수여야 함!!");
            return;
        }

        // 별 직사각형 출력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}