import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);  //입력받음
        String str = sc.next();
        int n = sc.nextInt();
	  
        String repeatedStr = repeatString(str, n);   //repeatString 함수를 이용해서 
        System.out.println(repeatedStr);  //출력
    }

    public static String repeatString(String str, int n) {  //문자열 반복 함수
        StringBuilder sb = new StringBuilder();
        /*
        String 과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존 데이터에 더하는 방식을 사용하기 때문에 속도가 빠름, 부하가 적음
        !! 긴 문자열이 생기는 경우 String Builder 를 사용하면 됨 !
        
        그냥 더하는 ex ) 
        String str1 = "abc";
        String str2 = "def";
        
        System.out.println (str1+str2);
        ▲ 위와 같은 연산을 하면 새로운 string을 생성하기 때문에 메모리 할당과 해제를 발생시키며 이러한 연산이 많아진다면 성능적으로 안좋아짐.
        
        
        */
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
